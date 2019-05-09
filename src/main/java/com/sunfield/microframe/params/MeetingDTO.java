package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="MeetingDTO", description="会议传输对象")
public class MeetingDTO {
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

    @ApiModelProperty(value="会议名称", dataType="String")
    private String name;
    @ApiModelProperty(value="会议地址", dataType="String")
    private String address;
    @ApiModelProperty(value="会议开始时间", dataType="Date")
    private Date startTime;
    @ApiModelProperty(value="会议结束时间", dataType="Date")
    private Date endTime;
    @ApiModelProperty(value="主办方名称", dataType="String")
    private String sponsorName;
    @ApiModelProperty(value="主办方电话", dataType="String")
    private String sponsorPhone;
    @ApiModelProperty(value="活动人数", dataType="String")
    private Integer number;
    @ApiModelProperty(value="活动介绍", dataType="String")
    private String message;
    @ApiModelProperty(value="封面图片", dataType="String")
    private String path;
    @ApiModelProperty(value="置顶排序", dataType="Integer")
    private Integer sort;
    @ApiModelProperty(value="状态:0开启，1关闭", dataType="Integer")
    private Integer state;
    @ApiModelProperty(value="评论数", dataType="Integer")
    private Integer commentNumber;
    @ApiModelProperty(value="单价", dataType="BigDecimal")
    private BigDecimal price;
    @ApiModelProperty(value="是否收费:1收费", dataType="Boolean")
    private Boolean charge;
    @ApiModelProperty(value="经度", dataType="String")
    private String longitude;
    @ApiModelProperty(value="维度", dataType="String")
    private String latitude;
    @ApiModelProperty(value="分享页面", dataType="String")
    private String dailUrl;
    @ApiModelProperty(value="参会总人数", dataType="Integer")
    private Integer userNumber;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorPhone() {
        return sponsorPhone;
    }

    public void setSponsorPhone(String sponsorPhone) {
        this.sponsorPhone = sponsorPhone;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getCharge() {
        return charge;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDailUrl() {
        return dailUrl;
    }

    public void setDailUrl(String dailUrl) {
        this.dailUrl = dailUrl;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }
}
