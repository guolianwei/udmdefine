package com.meritdata.datasource.model.param.model;

import com.meritdata.datasource.model.entity.Model;
/**
 * 模型保存参数对象
 * */
public class SaveParam {
    /**
     * 使用模型对象可以：<br/>
     * 1.字段更新;<br/>
     * 2.新增模型字段;<br/>
     * 3.模型字段删除;<br/>
     * 4.每次更新传递全量模型数据，覆盖数据库中的所有属性。<br/>
     */
    Model model;
}
