package com.starfish.advice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.starfish.model.PageResult;
import com.starfish.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * ResponseWrapper
 *
 * @author sunny
 * @version 1.0.0
 * @since 2021-06-10
 */
@Slf4j
@ControllerAdvice
public class ResponseWrapper implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof Result) {
            return body;
        }
        if (body instanceof PageResult) {
            return body;
        }
        // 当返回类型是String时，用的是StringHttpMessageConverter转换器，无法转换为Json格式
        // 参考：https://www.cnblogs.com/caozx/p/13329468.html
        // 参考：https://blog.csdn.net/chuwengliang4642/article/details/101055473
        // 参考：https://github.com/mingyang66/spring-parent/tree/master/emily-spring-boot-autoconfigure/src/main/java/com/emily/infrastructure/autoconfigure/response/handler
        if (body instanceof String) {
            response.getHeaders().set("Content-Type", "application/json;charset=utf-8");
            return JSON.toJSONString(new Result<>(body), SerializerFeature.WriteMapNullValue);
        }

        return new Result<>(body);
    }

}
