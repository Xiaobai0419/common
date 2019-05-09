package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(value="MeetingParams", description="会议参数传输对象")
public class MeetingParams {
    @ApiModelProperty(
            value = "创建者",
            dataType = "String"
    )
    private String createBy;
    @ApiModelProperty(
            value = "活动人数",
            dataType = "String"
    )
    private Integer number;
    @ApiModelProperty(
            value = "单价",
            dataType = "BigDecimal"
    )
    private BigDecimal price;
    @ApiModelProperty(
            value = "会议ID",
            dataType = "String"
    )
    private String meetingId;
    @ApiModelProperty(
            value = "支付方式：1微信，2支付宝",
            dataType = "Integer"
    )
    private Integer payment;
    @ApiModelProperty(
            value = "总额",
            dataType = "BigDecimal"
    )
    private BigDecimal total;

    public MeetingParams() {
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public Integer getPayment() {
        return this.payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
