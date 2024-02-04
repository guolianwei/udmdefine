package com.meritdata.datasource.model.enums;

public enum VersionDes {
    /**
     * 未发布
     */
    LIST("L",
            "list表示开始支持版本、开始废弃版本以列表表示，描述不同的版本，以逗号分隔。"),
    /**
     * 已发布
     */
    RANGE("R",
            "range表示开始支持版本、开始废弃版本以范围表示，闭区间。即支持的范围为[SUPPORT_VERSION,DEPRECATED_VERSION），不支持的范围是小于SUPPORT_VERSION的版本和大于等于DEPRECATED_VERSION的版本");
    private final String code;
    private final String desc;

    VersionDes(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
