package com.starfish.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * SwaggerProperties
 *
 * @author sunny
 * @version 1.0.0
 * @since 2018-11-05
 */
@Data
@ConfigurationProperties(prefix = "application.swagger")
public class SwaggerProperties {

    private Boolean enabled = true;

    private String basePackage;

    /**
     * 文档标题
     */
    private String title;

    /**
     * 文档描述
     */
    private String description;

    /**
     * 版本
     */
    private String version = "1.0.0";

    /**
     * 许可证
     */
    private String license = "Apache License2.0";

    /**
     * 许可证地址
     */
    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    /**
     * 姓名
     */
    private String name;

    /**
     * 网站
     */
    private String url;

    /**
     * 邮箱
     */
    private String email;

}