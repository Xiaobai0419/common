package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateBussinessIdParams", description="更新企业号认证ID入参")
public class UpdateBussinessIdParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="企业号认证关联id", dataType="String")
    private String  businessAuthenticationId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessAuthenticationId() {
        return businessAuthenticationId;
    }

    public void setBusinessAuthenticationId(String businessAuthenticationId) {
        this.businessAuthenticationId = businessAuthenticationId;
    }
}
