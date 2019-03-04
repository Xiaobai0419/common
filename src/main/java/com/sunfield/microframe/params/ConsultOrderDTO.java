package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/11
 */
@ApiModel(value="ConsultOrderDTO", description="咨询订单传输对象")
public class ConsultOrderDTO implements OrderDTO {

    @ApiModelProperty(value="id", dataType="String")
    private String id;

    @ApiModelProperty(value="订单的用户名ID", dataType="String")
    private String userId;

    @ApiModelProperty(value="订单的用户名", dataType="String")
    private String username;

    @ApiModelProperty(value="订单的用户昵称", dataType="String")
    private String nickname;

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

    @ApiModelProperty(value="订单创建时间", dataType="Date")
    private Date createTime;

    @ApiModelProperty(value="订单支付时间", dataType="Date")
    private Date payTime;

    @ApiModelProperty(value="微信或支付宝的订单号", dataType="String")
    private String payOrder;

    @ApiModelProperty(value="专家账号", dataType="String")
    private String expertCode;
    @ApiModelProperty(value="专家名称", dataType="String")
    private String expertUsername;
    @ApiModelProperty(value="专家ID", dataType="String")
    private String expertId;

    public ConsultOrderDTO(){

    }

    public ConsultOrderDTO(String id,String userId,String username,String nickname,Date createTime,Date payTime,BigDecimal total,String payOrder){
        this.id=id;
        this.userId=userId;
        this.username=username;
        this.nickname=nickname;
        this.createTime=createTime;
        this.payTime=payTime;
        this.total=total;
        this.payOrder=payOrder;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(String payOrder) {
        this.payOrder = payOrder;
    }

    public String getExpertCode() {
        return expertCode;
    }

    public void setExpertCode(String expertCode) {
        this.expertCode = expertCode;
    }

    public String getExpertUsername() {
        return expertUsername;
    }

    public void setExpertUsername(String expertUsername) {
        this.expertUsername = expertUsername;
    }

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }
}
