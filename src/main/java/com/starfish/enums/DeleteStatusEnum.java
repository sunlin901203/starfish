package com.starfish.enums;

/**
 * delete status enum
 *
 * @author sunny
 * @version 1.0.0
 * @since 2014-07-07
 */
@SuppressWarnings(value = "unused")
public enum DeleteStatusEnum {

    /**
     * 已删除
     */
    DELETE(1, "delete", "已删除"),

    /**
     * 未删除
     */
    NOT_DELETE(2, "not_delete", "未删除");

    private Integer code;
    private String name;
    private String message;

    /**
     * @param code    code
     * @param name    name
     * @param message message
     */
    DeleteStatusEnum(Integer code, String name, String message) {
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
    public static DeleteStatusEnum get(Integer code) {
        DeleteStatusEnum[] values = DeleteStatusEnum.values();
        DeleteStatusEnum v = null;
        for (DeleteStatusEnum value : values) {
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
    public static DeleteStatusEnum get(String name) {
        DeleteStatusEnum[] values = DeleteStatusEnum.values();
        DeleteStatusEnum v = null;
        for (DeleteStatusEnum value : values) {
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