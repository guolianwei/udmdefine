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
     String id;
    /**
     * 模型名称
     */
     String name;
    /**
     * 编码
     */
     String code;
    /**
     * 分类ID
     */
     String categoryId;
    /**
     * 是否发布 0：未发布，1：已发布
     */
     PublishState isPublished;
    /**
     * 第一次发布时间
     */
     String firstPublishTime;
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
     * 数据库ID
     */
     String dataBaseId;
    /**
     * 数据库schema
     */
     String databaseSchema;
    /**
     * 创建模式
     */
     CreateMode createMode;
    /**
     * 管理内容范围
     */
     ManageContentScope manageContentScope;
    /**
     * 是否管理版本
     */
     WhetherValue isManageVersion;
    /**
     * 版本号
     */
     String version;
    /**
     * 模型状态--版本状态
     */
     ModelVersionStatus status;
    /**
     * 编辑状态下的表名称
     */
     String editingStatusTableName;
    /**
     * 发布状态下的表名称
     */
     String publishedStatusTableName;
    /**
     * 发布时间
     */
     String publishTime;
    /**
     * 是否最大版本
     */
     WhetherValue isMaxVersion;
    /**
     * 密级
     */
     String secretsLevel;
    /**
     * 字段
     */
     Field[] fields;
    /**
     * 模型信息
     */
     String modelInfo;

    /**
     * 级别编码，为父分类的LEVEL_CODE+自己所处层级的六位编号，如父分类为000001，
     * 自己为父分类下的第三个子分类，则自己的LEVEL_CODE为000001000003
     **/
     String levelCode;
}
