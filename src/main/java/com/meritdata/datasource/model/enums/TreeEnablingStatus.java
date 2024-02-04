package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: EnablingStatus
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 13:50
 */
public enum TreeEnablingStatus {
    /**
     * 启用状态 0：否 1：是
     */
    ENABLE(1, "启用"),
    DEACTIVATE(0, "停用");

    private final int code;
    private final String desc;

    TreeEnablingStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public  int getCode() {
        return code;
    }
    public  String getDesc() {
        return desc;
    }
}
