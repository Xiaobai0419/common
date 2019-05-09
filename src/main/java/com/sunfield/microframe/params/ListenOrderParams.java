package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(value="ListenOrderParams", description="旁听订单传输对象")
public class ListenOrderParams implements OrderDTO
{

    public ListenOrderParams(){}

    public ListenOrderParams(String uesrId,String majorUsername,String majorCode,String counsultId,String listenId,String majorId){
        this.userId=uesrId;
        this.majorUsername=majorUsername;
        this.majorCode=majorCode;
        this.counsultId=counsultId;
        this.listenId=listenId;
        this.majorId=majorId;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String userId;
    @ApiModelProperty(value="专家名称", dataType="String")
    private String majorUsername;
    @ApiModelProperty(value="专家账号", dataType="String")
    private String majorCode;
    @ApiModelProperty(value="咨询信息ID", dataType="String")
    private String counsultId;
    @ApiModelProperty(value="旁听ID",dataType="String")
    private String listenId;
    @ApiModelProperty(value="价格",dataType="BigDecimal")
    private BigDecimal price;
    @ApiModelProperty(value="专家ID",dataType="String")
    private String majorId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMajorUsername()
    {
        return this.majorUsername;
    }

    public void setMajorUsername(String majorUsername)
    {
        this.majorUsername = majorUsername;
    }

    public String getCounsultId()
    {
        return this.counsultId;
    }

    public void setCounsultId(String counsultId)
    {
        this.counsultId = counsultId;
    }

    public String getMajorCode()
    {
        return this.majorCode;
    }

    public void setMajorCode(String majorCode)
    {
        this.majorCode = majorCode;
    }


    public String getListenId() {
        return listenId;
    }

    public void setListenId(String listenId) {
        this.listenId = listenId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }
}
