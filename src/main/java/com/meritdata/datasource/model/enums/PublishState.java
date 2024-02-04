package com.meritdata.datasource.model.enums;

/**
 * @PackageName: com.meritdata.datasource.model.enums
 * @ClassName: PublishState
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 11:26
 */
public enum PublishState {
    /**
     *  未发布
     */
    UNPUBLISHED(0, "未发布"),
    /**
     *  已发布
     */
    PUBLISHED(1, "已发布");
     final Integer code;
     final String desc;

    PublishState(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
