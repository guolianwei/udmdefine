package com.meritdata.datasource.model.enums;

public enum Status {
    DISABLE(0, "停用"),
    ENABLE(1, "启用");

    private final int code;
    private final String desc;

    Status(int code, String desc) {
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
