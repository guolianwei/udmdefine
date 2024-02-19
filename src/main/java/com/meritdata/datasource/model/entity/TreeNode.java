package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.TreeExpandState;
import com.meritdata.datasource.model.enums.TreeType;
import com.meritdata.datasource.model.enums.WhetherValue;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: TreeNode
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 14:54
 */
public class TreeNode {
    /**
     * 是否叶子节点
     */
    WhetherValue leaf;
    /**
     * 节点属性
     */
    TreeExpandState state;
    boolean checked;
    String text;
    String id;

    /**
     * 类型 0 树节点为分类 CategoryTreeAttributes，1 树节点为模型  ModelTreeAttributes
     * */
    TreeType type;


    ModelTreeAttributes  modelTreeAttributes;
    CategoryTreeAttributes  categoryTreeAttributes;


    /**
     * 子节点
     */
    TreeNode[] children;
}
