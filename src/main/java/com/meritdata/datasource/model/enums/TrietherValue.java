package com.meritdata.datasource.model.enums;

public enum TrietherValue {
    NO(0, "否 | 无"),
    YES(1, "是 | 有"),
    NULL(-1, "未定义 | 其他");

    private final int code;
    private final String desc;

    TrietherValue(int code, String desc) {
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
