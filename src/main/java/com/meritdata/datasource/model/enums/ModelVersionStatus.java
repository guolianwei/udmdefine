package com.meritdata.datasource.model.enums;

/**
 * 模型版本/数据版本状态枚举
 */
public enum ModelVersionStatus {
    /**
     * 停用
     */
    STOP("停用", 0),
    /**
     * 生效
     */
    EFFECT("生效", 1),
    /**
     * 编辑中
     */
    EDIT("编辑中", 2),
    /**
     * 审核中
     */
    AUDIT("审核中", 3),
    /**
     * 历史
     */
    HISTORY("历史", 4);

    /**
     * 枚举名称
     */
     String name;

    /**
     * 枚举值
     */
     Integer value;

    ModelVersionStatus(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
    public boolean is(Integer value){
        return this.value.equals(value);
    }

    public static ModelVersionStatus of(Integer value) {
        if (value != null) {
            ModelVersionStatus[] types = ModelVersionStatus.values();
            for (ModelVersionStatus type : types) {
                if (type.value.equals(value)) {
                    return type;
                }
            }
        }
        return null;
    }
}
