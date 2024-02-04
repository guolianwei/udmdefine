package com.meritdata.datasource.model.param;

import com.meritdata.datasource.model.param.enums.DSListMode;

public class ListParam {
    /**
     * 用户登录名 pf_org_user 的 USER_ID
     */
    private String userId;
    /**
     * 数据源类型
     */
    private String type;

    /**
     * 列表模式
     * SIMPLE("simple", "简单模式, 返回基础数据源模型 BaseDataSource模型")
     * ALL("all", "全量模式,返回数据源对象 DataSource模型")
     */
    private DSListMode mode;


    /**
     * 数据源变换目标
     * 例如:将hive变换为presto,此处填写 presto
     */
    private String transform;
}
