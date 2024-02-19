package com.meritdata.datasource.model.enums;

public enum TreeType {
    CATEGORY(0, "category"),
    MODEL(1, "model");

     final int code;
     final String desc;

    TreeType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
