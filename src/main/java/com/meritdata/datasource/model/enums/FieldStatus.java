package com.meritdata.datasource.model.enums;

import java.util.Arrays;

/**
 * 字段状态
 */
public enum FieldStatus {
    DISABLE(0, "停用"),
    ENABLE(1, "启用");

    final int code;
    final String desc;

    FieldStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static FieldStatus getByCode(int code) {
        return Arrays.stream(FieldStatus.values())
                .filter(mode -> mode.getCode() == code)
                .findFirst()
                .orElse(null);
    }
}
