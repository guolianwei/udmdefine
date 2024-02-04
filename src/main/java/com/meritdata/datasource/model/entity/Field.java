package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.*;
import sun.reflect.generics.tree.Tree;

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
     String id;
    /**
     * 业务名称
     */
     String businessName;
    /**
     * 字段名称
     */
     String fieldName;
    /**
     * 字段类型
     */
     String dataType;
    /**
     * 字段长度
     */
     String length;
    /**
     * 排序编号
     */
     String sortNumber;
    /**
     * 修改状态 0:新增  1:更新
     */
     ModifyStatus modifyStatus;
    /**
     * 最后一次生效的属性名称
     */
     String publishName;
    /**
     * 修改用户
     */
     String modifyUser;
    /**
     * 修改时间
     */
     String modifyTime;
    /**
     * 修改部门
     */
     String modifyDept;
    /**
     * 使用的字符类型
     */
     UsingCharacterTypes usingCharacterType;
    /**
     * 关联Model ID
     */
     String modelVersionId;
    /**
     * 字段主ID
     */
     String modelFieldId;
    /**
     * 是否唯一
     */
     WhetherValue isUnique;
     FieldStatus status;

    /**
     * 枚举值：1：受无符号限制，0：没有无符号限制，其他-1
     */
     SignRestriction unsigned;
    /**
     * 精度
     */
     int definition;


    /**
     * 字段类型关联信息
     */
     FieldDataType fieldDataType;

}
