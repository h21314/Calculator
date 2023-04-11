package com.hetufei.enums;

/**
 * 操作类型枚举
 * @author hetufei
 */
public enum OperatorEnum {

    /**
     * 加法
     */
    ADD("+","加法"),

    /**
     * 减法
     */
    SUBTRACT("-","减法"),

    /**
     * 乘法
     */
    MULTIPLY("*","乘法"),

    /**
     * 除法
     */
    DIVIDE("/","除法")

    ;

    public String getCode() {
        return code;
    }

    private String code;

    private String desc;

    OperatorEnum(String code,String desc){
        this.code = code;
        this.desc = desc;
    }

}
