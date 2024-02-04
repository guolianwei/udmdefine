package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: UsingCharacterTypes
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 13:54
 */
public enum UsingCharacterTypes {
    /**
     * 0: 字符
     * 1: 字节
     * 2: 其他
     */
    CHARACTER(0, "字符"),
    BYTE(1, "字节"),
    OTHER(2, "其他");

     final int code;
     final String desc;

    UsingCharacterTypes(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public  int getCode() {
        return code;
    }
    public  String getDesc() {
        return desc;
    }
}
