package com.meritdata.datasource.model.entity;

import com.meritdata.datasource.model.enums.*;

import java.util.Date;

public class ModelTreeAttributes {
    String id;
    String name;
    String code;
    String modelInfo;

    /*
     *？？？    SINGLE
     * */
    String type;

    PublishState published;

    String databaseId;

    String databaseSchema;

    CreateMode createMode;

    /**
     * "tableOrView": "T", ????
     */
    TableOrView tableOrView;

    int manageContent;
    int manageVersion;
    int version;

    ModelStatus status;

    String tableName;
    String publishTableName;

    Date publishTime;

    int maxVersion;

}
