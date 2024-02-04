package com.meritdata.datasource.model.param.enums;

/**
 * 返回数据源列表时的模式参数，两种模式：<br/>
 * "simple":"简单模式, 返回基础数据源模型 BaseDataSource模型" <br/>
 * "all": "全量模式,返回数据源对象 DataSource模型" <br/>
 * */
public enum DSListMode {
    SIMPLE("simple", "简单模式, 返回基础数据源模型 BaseDataSource模型"),
    ALL("all", "全量模式,返回数据源对象 DataSource模型");

    private final String code;
    private final String desc;

    DSListMode(String code, String desc) {
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
