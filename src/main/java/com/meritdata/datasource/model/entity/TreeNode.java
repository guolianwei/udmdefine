package com.meritdata.datasource.model.entity;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: TreeNode
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 14:54
 */
public class TreeNode {
    /**
     * 节点属性
     */
    private TreeAttributes attribute;
    /**
     * 基础模型
     */
    private BaseModel baseModel;
    /**
     * 子节点
     */
    private TreeNode[] children;
}
