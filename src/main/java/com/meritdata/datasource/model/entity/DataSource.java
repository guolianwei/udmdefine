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
     String id;
    /**
     *  数据源编码
     */
     String code;
    /**
     * 数据源名称
     */
     String name;
    /**
     * 数据源类型
     */
     String type;
    /**
     * 数据源地址
     */
     String url;
    /**
     * 数据源用户名
     */
     String username;
    /**
     * 数据源密码
     */
     String drowssap;
    /**
     * 操作的对象信息
     * @TODO:确认类型和是否多值
     */
     String toSchema[];
    /**
     * 连接信息的自定义属性
     */
     String[] udfAttrs;

}
