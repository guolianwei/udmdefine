package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: ManageContentScope
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 11:37
 */
public enum ManageContentScope {
    /**
     * 0: 仅查询数据
     * 1: 仅管理表结构
     * 2: 仅管理数据
     * 3: 管理表结构和数据
     */
    ONLY_QUERY_DATA(0, "仅查询数据"),
    ONLY_MANAGE_TABLE_STRUCTURE(1,"仅管理表结构"),
    ONLY_MANAGE_DATA(2, "仅管理数据"),
    MANAGE_TABLE_STRUCTURE_AND_DATA(3, "管理表结构和数据");

     final int code;
     final String desc;

    ManageContentScope(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public  int getCode() {
         return code;
    }

    public String getDesc() {
        return desc;
    }
}
