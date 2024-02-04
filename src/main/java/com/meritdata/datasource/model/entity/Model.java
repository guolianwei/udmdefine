package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.*;

/**
 * @PackageName: com.meritdata.datasource.model.entity
 * @ClassName: Model
 * @Description:
 * @Author: MH
 * @Date: 2024/1/29 029 11:13
 */
public class Model {
    /**
     * 数据库主键
     */
    private String id;
    /**
     * 模型名称
     */
    private String name;
    /**
     * 业务定义
     */
    private String code;
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 是否发布 0：未发布，1：已发布
     */
    private PublishState isPublished;
    /**
     * 第一次发布时间
     */
    private String firstPublishTime;
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
     * 数据库ID
     */
    private String dataBaseId;
    /**
     * 数据库schema
     */
    private String databaseSchema;
    /**
     * 创建模式
     */
    private CreateMode createMode;
    /**
     * 管理内容范围
     */
    private ManageContentScope manageContentScope;
    /**
     * 是否管理版本
     */
    private WhetherValue isManageVersion;
    /**
     * 版本号
     */
    private String version;
    /**
     * 模型状态--版本状态
     */
    private ModelVersionStatusEnum status;
    /**
     * 编辑状态下的表名称
     */
    private String editingStatusTableName;
    /**
     * 发布状态下的表名称
     */
    private String publishedStatusTableName;
    /**
     * 发布时间
     */
    private String publishTime;
    /**
     * 是否最大版本
     */
    private WhetherValue isMaxVersion;
    /**
     * 密级
     */
    private String secretsLevel;
    /**
     * 字段
     */
    private Field[] fields;
    /**
     * 模型信息
     */
    private String modelInfo;
}
