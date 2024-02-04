package com.meritdata.datasource.model.enums;

public enum TreeGroupType {
    ORG(0, "org"),
    DEPT(1, "dept"),
    GROUP(2, "group");

    private final int code;
    private final String desc;

    TreeGroupType(int code, String desc) {
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
