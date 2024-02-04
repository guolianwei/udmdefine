package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.EnablingStatus;
import com.meritdata.datasource.model.enums.ExpandState;

class TreeAttributes {
    private ExpandState expandState;
    private EnablingStatus remark;
    /**
     * 数据源id
     */
    private String id;
    /**
     * 数据源编码
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


    /**
     * 是否检查
     */
    private boolean isChecked;
    /**
     * 是否有权限
     */
    private boolean isHavePermission;
    /**
     * 创建用户
     */
    private String createUser;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 创建部门
     */
    private String createDept;
    /**
     * 等级
     */
    private String levelCode;
    /**
     * 备注
     */

}
