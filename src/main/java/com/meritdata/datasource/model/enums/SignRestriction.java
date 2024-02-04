package com.meritdata.datasource.model.enums;

public enum SignRestriction {
    NO(0, "无"),
    YES(1, "有"),
    OTHER(-1, " 其他");

    private final int code;
    private final String desc;

    SignRestriction(int code, String desc) {
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
