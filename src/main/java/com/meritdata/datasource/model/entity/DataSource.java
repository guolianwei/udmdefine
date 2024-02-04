package com.meritdata.datasource.model.entity;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: DataSource
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 14:51
 */
public class DataSource {
    /**
     * 数据源id
     */
    private String id;
    /**
     *  数据源编码
     */
    private String code;
    /**
     * 数据源名称
     */
    private String name;
    /**
     * 数据源类型
     */
    private String type;
    /**
     * 数据源地址
     */
    private String url;
    /**
     * 数据源用户名
     */
    private String username;
    /**
     * 数据源密码
     */
    private String password;
    /**
     * 操作的对象信息
     */
    private Integer toSchema;
    /**
     * 连接信息的自定义属性
     */
    private String[] udfAttrs;
}
