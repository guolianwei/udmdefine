package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: CreateMode
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 11:25
 */
public enum CreateMode {
    /**
     * 新建
     */
    NEW_BUILT(0, "新建"),
     /**
     * 抽取
     */
     EXTRACT(1, "抽取"),
     /**
     * ETL输出
     */
     ETL_OUTPUT(2, "ETL输出");

    private final int code;
    private final String desc;

    CreateMode(int code, String desc) {
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
