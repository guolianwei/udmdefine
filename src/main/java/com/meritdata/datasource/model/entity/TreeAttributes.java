package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.TreeEnablingStatus;
import com.meritdata.datasource.model.enums.TreeExpandState;
import com.meritdata.datasource.model.enums.TreeGroupType;
import com.meritdata.datasource.model.enums.WhetherValue;

class TreeAttributes {
    private TreeExpandState expandState;
    private TreeEnablingStatus status;

    /**
     * 父节点ID
     * -1代表是跟节点
     */
    private String parentId;
    private int sortNumber;
    /**
     * 数据源名称
     */
    private String name;
    /**
     * 是否叶子节点
     */
    private WhetherValue leaf;
    /**
     * 类型
     */
    private TreeGroupType type;


    /**
     * 是否检查
     */
    private boolean checked;
    /**
     * 是否有权限
     */
    private boolean havePermission;
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
     * 备注
     */
    private String remark;
}
