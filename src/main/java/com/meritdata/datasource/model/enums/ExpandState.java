package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: WhetherOpenStatus
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 14:38
 */
public enum ExpandState {
    /**
     * 启用状态 0：否 1：是
     */
    CLOSE(0, "关闭"),
    EXPANDED(1, "展开");

    private final int code;
    private final String desc;

    ExpandState(int code, String desc) {
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