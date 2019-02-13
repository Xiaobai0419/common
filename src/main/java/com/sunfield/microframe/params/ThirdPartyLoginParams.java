package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="ThirdPartyLoginParams", description="第三方登录入参")
public class ThirdPartyLoginParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="第三方账号ID", dataType="String")
    private String openId;

    @ApiModelProperty(value="登录方式(wx:微信;qq:QQ;sina:新浪微博;)", dataType="String")
    private String type;

    @ApiModelProperty(value="用户昵称", dataType="String")
    private String nickName;

    @ApiModelProperty(value="头像url", dataType="String")
    private String headPicUrl;

    @ApiModelProperty(value="手机号", dataType="String")
    private String mobile;

    @ApiModelProperty(value="验证码", dataType="String")
    private String identifyCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPicUrl() {
        return headPicUrl;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
    }

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
