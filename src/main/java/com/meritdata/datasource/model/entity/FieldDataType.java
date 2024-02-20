package com.meritdata.datasource.model.entity;


import com.meritdata.datasource.model.enums.*;

import java.io.Serializable;


/**
 * 数据类型字典表
 */

public class FieldDataType {

    /**
     * 序列化版本标识
     */
     static final long serialVersionUID = 1L;

     String id;

     String databaseType;
    /**
     * 数据类型，数据库中的原始类型
     **/
     String dataType;
    /**
     * 是否需要维护长度，枚举值：1是0否
     **/
     WhetherValue needLength;
    /**
     * 默认长度
     **/
    Integer defaultLength;
    /**
     * 最大长度
     */
     Integer maxLength;
    /**
     * 最小长度
     */
     Integer minLength;


    /**
     * 是否需要维护字符使用说明。
     * 枚举值：
     * 1-是
     * 0-否
     */
     WhetherValue needCharUsed;

    /**
     * 默认字符使用说明
     */
     String defaultCharUsed;

    /**
     * 是否需要维护精度，枚举值：1是0否
     **/
     Integer needDefinition;
    /**
     * 默认精度
     **/

     Integer defaultDefinition;
    /**
     * 最大精度
     */
     Integer maxDefinition;
    /**
     * 最小精度
     */
     Integer minDefinition;
    /**
     * 是否需要维护无符号约束。
     * 枚举值：
     * 1-是
     * 0-否
     */
     WhetherValue needIsUnsigned;



    /**
     * 业务类型，枚举值：STRING字符型，NUMBER数值型，DATE日期型，CLOB大文本
     **/
     BusiType busiType;

    /**
     * 日期型默认的日期格式（Java日期格式）
     **/

     String dateFormat;

    /**
     * 开始支持版本。
     * 开始支持版本为空时，表示仅受开始废弃版本的限制。
     * 开始支持版本、开始废弃版本均为空时，表示数据库各版本均支持
     **/
     String supportVersion;
    /**
     * 开始废弃版本。
     * 开始废弃版本为空时，表示仅受开始支持版本的限制。
     * 开始支持版本、开始废弃版本均为空时，表示数据库各版本均支持
     **/
     String deprecatedVersion;
    /**
     * 版本描述方式。
     * L：list表示开始支持版本、开始废弃版本以列表表示，描述不同的版本，以逗号分隔。
     * R：range表示开始支持版本、开始废弃版本以范围表示，闭区间。即支持的范围为[SUPPORT_VERSION,DEPRECATED_VERSION），不支持的范围是小于SUPPORT_VERSION的版本和大于等于DEPRECATED_VERSION的版本
     **/
     VersionDes versionDes;
    /**
     * 替代数据类型。表示在不支持版本中的替代数据类型
     **/
     String replaceDataType;

    /**
     * 是否抽取。
     * 1——是，支持该类型的抽取
     * 0——否，暂不支持抽取该类型
     * -1——无,抽取类型中无该类型
     */

    TrietherValue extract;

    /**
     * 是否创建。
     * 1——是，支持包含该类型的模型创建
     * 0——否，暂不支持包含该类型的模型创建
     * -1——创建无该类型
     */
     TrietherValue create;
    /**
     * 1--是否允许作为唯一标识或匹配字段。
     * 0——否，不能作为唯一标识和匹配字段
     */
     WhetherValue allowedSetUnique;
}