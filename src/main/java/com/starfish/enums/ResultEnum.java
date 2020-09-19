package com.starfish.enums;

/**
 * 结果枚举
 *
 * @author sunny
 * @version 1.0.0
 * @since 2014-07-07
 */
@SuppressWarnings(value = "unused")
public enum ResultEnum {

    /**
     * 部分统一的错误从801开始，自定义错误从1001开始
     */
    SUCCESS(200, "success", "成功"),

    SYSTEM_EXCEPTION(500, "system_exception", "系统异常"),

    PARAM_ERROR(801, "param_error", "参数错误"),

    DATE_TIME_FORMAT_ERROR(1001, "date_time_format_error", "日期格式有误"),

    PARSE_DATE_TIME_ERROR(1002, "parse_date_time_error", "解析日期异常"),

    FILE_PATH_IS_EMPTY(1003, "file_path_is_empty", "文件路径为空"),

    FILE_ALREADY_EXIST(1004, "file_already_exist", "文件已存在"),

    FILE_DOWNLOAD_ERROR(1005, "file_download_error", "下载文件异常"),

    DECOMPRESS_FILE_ERROR(1006, "decompress_file_error", "解压文件异常"),

    COMPRESS_FILE_ERROR(1007, "compress_file_error", "压缩文件异常"),

    CAN_NOT_FIND_METHOD(1008, "can_not_find_method", "找不到方法"),

    FIELD_COUNT_IS_ZERO(1009, "field_count_is_zero", "当前对象中没有任何属性值"),

    ;

    private Integer code;
    private String name;
    private String message;

    /**
     * @param code    code
     * @param name    name
     * @param message message
     */
    ResultEnum(Integer code, String name, String message) {
        this.code = code;
        this.name = name;
        this.message = message;
    }

    /**
     * get the code of the enum
     *
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * get the name of the enum
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * get the message of the enum
     *
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * get the enum by code
     *
     * @param code code
     * @return the enum
     */
    public static ResultEnum get(Integer code) {
        ResultEnum[] values = ResultEnum.values();
        ResultEnum v = null;
        for (ResultEnum value : values) {
            if (value.getCode().equals(code)) {
                v = value;
                break;
            }
        }
        return v;
    }

    /**
     * get the enum by name
     *
     * @param name name
     * @return the enum
     */
    public static ResultEnum get(String name) {
        ResultEnum[] values = ResultEnum.values();
        ResultEnum v = null;
        for (ResultEnum value : values) {
            if (value.getName().equalsIgnoreCase(name)) {
                v = value;
                break;
            }
        }
        return v;
    }

    /**
     * 判断此编码的枚举是否存在
     *
     * @param code 编码
     * @return 结果
     */
    public static boolean exist(Integer code) {
        return get(code) != null;
    }

    /**
     * 判断此名称枚举是否存在
     *
     * @param name 名称
     * @return 结果
     */
    public static boolean exist(String name) {
        return get(name) != null;
    }

}