package com.meritdata.datasource.model.enums;

import java.util.Arrays;

public enum BusiType {
    STRING("STRING", "STRING字符型"),
    NUMBER("NUMBER", "NUMBER数值型"),
    DATE("DATE", "DATE日期型"),
    CLOB("CLOB", "CLOB大文本");

    final String code;
    final String desc;

    BusiType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static BusiType getByCode(String code) {
        return Arrays.stream(BusiType.values())
                .filter(mode -> mode.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
