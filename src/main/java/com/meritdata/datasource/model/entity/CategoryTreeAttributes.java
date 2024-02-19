package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.WhetherValue;

import java.util.Date;

class CategoryTreeAttributes {

    /**
     * 父节点ID
     * -1代表是跟节点
     */
    String tenantId;

    String id;
    String name;
    String code;
    int sortNumber;

    String remark;

    String parentId;

    String levelCode;
    /**
     * @TODO:确定这个status的具体枚举值和说明
     */
    String status;

    String type;

    String createUser;

    Date createTime;
    /**
     * @TODO: 确认是否和其他值有关联
     */
    String createDept;

}
