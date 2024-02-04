package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.ModelVersionStatus;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: BaseModel
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 14:46
 */
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
     * 表名
     */
     String tableName;
    /**
     * 模型分类id
     */
     String categoryId;
}
