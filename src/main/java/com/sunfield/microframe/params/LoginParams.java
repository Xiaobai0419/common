package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="LoginParams", description="登录入参")
public class LoginParams {

    @ApiModelProperty(value="手机号", dataType="String")
    private String mobile;

    @ApiModelProperty(value="验证码", dataType="String")
    private String identifyCode;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }
}
