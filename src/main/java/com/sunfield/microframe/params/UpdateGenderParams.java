package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateGenderParams", description="更新性别入参")
public class UpdateGenderParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="性别(1:男;2:女)", dataType="Integer")
    private Integer gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
