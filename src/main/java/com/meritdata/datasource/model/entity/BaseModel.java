package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.ModelVersionStatus;

public class BaseModel {
    /**
     * 模型id
     */
    String id;
    /**
     *  模型编码
     */
    String code;
    /**
     * 模型名称
     */
    String name;
    /**
     * 模型状态
     */
    ModelVersionStatus status;
    /**
     * 编辑中状态表名
     */
    String editingStatusTableName;
    /**
     * 模型分类id
     */
    String categoryId;
}
