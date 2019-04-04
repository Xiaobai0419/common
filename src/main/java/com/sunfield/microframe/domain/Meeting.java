package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/12
 */
@ApiModel(value="Meeting", description="活动会议")
public class Meeting extends BaseDomain {
    @ApiModelProperty(value="会议名称", dataType="String")
    private String name;
    @ApiModelProperty(value="会议地址", dataType="String")
    private String address;
    @ApiModelProperty(value="会议时间", dataType="Date")
    private Date dateTime;
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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
}

