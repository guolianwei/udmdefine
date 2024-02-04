package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: ModelStatus
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 13:34
 */
public enum ModelStatus {
    /**
     * 模型状态
     */
    EDITING(0, "编辑中"),
    PUBLISHED(1, "已发布");

    private final int code;
    private final String desc;

    ModelStatus(int code, String desc) {
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
