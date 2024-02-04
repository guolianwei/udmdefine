package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.TreeEnablingStatus;
import com.meritdata.datasource.model.enums.TreeExpandState;
import com.meritdata.datasource.model.enums.TreeGroupType;
import com.meritdata.datasource.model.enums.WhetherValue;

class TreeAttributes {
     TreeExpandState expandState;
     TreeEnablingStatus status;

    /**
     * 父节点ID
     * -1代表是跟节点
     */
     String parentId;
     int sortNumber;
    /**
     * 数据源名称
     */
     String name;
    /**
     * 是否叶子节点
     */
     WhetherValue leaf;
    /**
     * 类型
     */
     TreeGroupType type;


    /**
     * 是否检查
     */
     boolean checked;
    /**
     * 是否有权限
     */
     boolean havePermission;
    /**
     * 创建用户
     */
     String createUser;
    /**
     * 创建时间
     */
     String createTime;
    /**
     * 创建部门
     */
     String createDept;
    /**
     * 备注
     */
     String remark;
}
