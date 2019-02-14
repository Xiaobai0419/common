package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/12
 */
@ApiModel(value="MeetingStatisticsParam", description="活动会议统计信息")
public class MeetingStatisticsParam {
    public MeetingStatisticsParam(){}
    public MeetingStatisticsParam(String createBy,String enrollUsername,String enrollNickname,Date enrollTime,Integer num,BigDecimal price,String meetingId){
        this.createBy=createBy;
        this.enrollUsername=enrollUsername;
        this.enrollNickname=enrollNickname;
        this.enrollTime=enrollTime;
        this.num=num;
        this.price=price;
        this.meetingId=meetingId;
    }

    @ApiModelProperty(value="主键", dataType="String")
    private String id;

    @ApiModelProperty(value="创建者", dataType="String")
    private String createBy;

    @ApiModelProperty(value="创建时间", dataType="Date")
    private Date createDate;

    @ApiModelProperty(value="更新者", dataType="String")
    private String updateBy;

    @ApiModelProperty(value="更新时间", dataType="Date")
    private Date updateDate;

    @ApiModelProperty(value="备注", dataType="String")
    private  String remarks;

    @ApiModelProperty(value="报名用户名", dataType="String")
    private String enrollUsername;
    @ApiModelProperty(value="报名用户昵称", dataType="String")
    private String enrollNickname;
    @ApiModelProperty(value="报名时间", dataType="Date")
    private Date enrollTime;
    @ApiModelProperty(value="报名人数", dataType="Integer")
    private Integer num;
    @ApiModelProperty(value="总额",dataType="BigDecimal")
    private BigDecimal price;
    @ApiModelProperty(value="是否签到", dataType="Boolean")
    private Boolean sign;
    @ApiModelProperty(value="会议ID", dataType="String")
    private String meetingId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEnrollUsername() {
        return enrollUsername;
    }

    public void setEnrollUsername(String enrollUsername) {
        this.enrollUsername = enrollUsername;
    }

    public String getEnrollNickname() {
        return enrollNickname;
    }

    public void setEnrollNickname(String enrollNickname) {
        this.enrollNickname = enrollNickname;
    }

    public Date getEnrollTime() {
        return enrollTime;
    }

    public void setEnrollTime(Date enrollTime) {
        this.enrollTime = enrollTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getSign() {
        return sign;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
}
