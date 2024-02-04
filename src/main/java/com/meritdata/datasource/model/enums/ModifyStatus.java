package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: ModifyStatus
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 13:47
 */
public enum ModifyStatus {
    /**
     * 修改状态 0：否 1：是
     */
    ADD(0, "新增"),
    UPDATE(1, "更新");

    private final int code;
    private final String desc;

    ModifyStatus(int code, String desc) {
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
