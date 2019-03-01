package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateHeadParams", description="更新头像入参")
public class UpdateHeadParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="头像url", dataType="String")
    private String headPicUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadPicUrl() {
        return headPicUrl;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
    }
}
