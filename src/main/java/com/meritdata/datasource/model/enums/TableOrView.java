package com.meritdata.datasource.model.enums;

import java.util.Arrays;

public enum TableOrView {
    STRING("T", "表格"),
    NUMBER("V", "视图");

    final String code;
    final String desc;

    TableOrView(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static TableOrView getByCode(String code) {
        return Arrays.stream(TableOrView.values())
                .filter(mode -> mode.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
