package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.*;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: Field
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 13:44
 */
public class Field {
    /**
     * 字段ID
     */
    private String id;
    /**
     * 业务名称
     */
    private String businessName;
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段类型
     */
    private String dataType;
    /**
     * 字段长度
     */
    private String length;
    /**
     * 排序编号
     */
    private String sortNumber;
    /**
     * 修改状态 0:新增  1:更新
     */
    private ModifyStatus modifyStatus;
    /**
     * 启用状态 0:禁用  1:启用
     */
    private EnablingStatus enablingStatus;
    /**
     * 最后一次生效的属性名称
     */
    private String publishName;
    /**
     * 修改用户
     */
    private String modifyUser;
    /**
     * 修改时间
     */
    private String modifyTime;
    /**
     * 修改部门
     */
    private String modifyDept;
    /**
     * 使用的字符类型
     */
    private UsingCharacterTypes usingCharacterType;
    /**
     * 关联Model ID
     */
    private String modelVersionId;
    /**
     * 字段主ID
     */
    private String modelFieldId;
    /**
     * 是否唯一
     */
    private WhetherValue isUnique;
    private Status status;
    /**
     * 字段类型关联信息
     */
    private FieldDataType fieldDataType;
}
