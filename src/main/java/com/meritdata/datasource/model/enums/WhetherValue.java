package com.meritdata.datasource.model.enums;

public enum WhetherValue {
    NO(0, "否"),
    YES(1, "是");

    private final int code;
    private final String desc;

    WhetherValue(int code, String desc) {
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
