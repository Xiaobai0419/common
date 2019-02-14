package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/11
 */
@ApiModel(value="ConsultOrderParam", description="咨询订单传输对象")
public class ConsultOrderParam implements OrderDTO {

    @ApiModelProperty(value="id", dataType="String")
    private String id;

    @ApiModelProperty(value="订单的用户名ID", dataType="String")
    private String userId;

    @ApiModelProperty(value="咨询信息内容", dataType="String")
    private String consultMessage;

    @ApiModelProperty(value="咨询信息ID", dataType="String")
    private String counsultId;

    @ApiModelProperty(value="总额", dataType="BigDecimal")
    private BigDecimal total;

    @ApiModelProperty(value="马粮", dataType="Integer")
    private BigDecimal food;

    @ApiModelProperty(value="支付方式:1微信、2支付宝", dataType="Integer")
    private Integer payment;

    @ApiModelProperty(value="支付费用", dataType="BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value="支付方式(中文表现形式)", dataType="String")
    private String pay;

    @ApiModelProperty(value="微信或支付宝的订单号", dataType="String")
    private String payOrder;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getConsultMessage() {
        return consultMessage;
    }

    public void setConsultMessage(String consultMessage) {
        this.consultMessage = consultMessage;
    }

    public String getCounsultId() {
        return counsultId;
    }

    public void setCounsultId(String counsultId) {
        this.counsultId = counsultId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getFood() {
        return food;
    }

    public void setFood(BigDecimal food) {
        this.food = food;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(String payOrder) {
        this.payOrder = payOrder;
    }
}
