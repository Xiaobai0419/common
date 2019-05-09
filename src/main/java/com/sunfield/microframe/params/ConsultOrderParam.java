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

    public ConsultOrderParam(){}

    public ConsultOrderParam(String userId,String consultMessage,String counsultId,BigDecimal total){
        this.userId=userId;
        this.consultMessage=consultMessage;
        this.counsultId=counsultId;
        this.total=total;
    }


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

    @ApiModelProperty(value="是否马粮支付:0未使用，1已使用", dataType="Integer")
    private Boolean food;

    @ApiModelProperty(value="支付方式:1微信、2支付宝", dataType="Integer")
    private Integer payment;

    @ApiModelProperty(value="支付费用", dataType="BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value="支付方式(中文表现形式)", dataType="String")
    private String pay;

    @ApiModelProperty(value="微信或支付宝的订单号", dataType="String")
    private String payOrder;

    @ApiModelProperty(value="专家账号", dataType="String")
    private String expertCode;

    @ApiModelProperty(value="专家名称", dataType="String")
    private String expertUsername;

    @ApiModelProperty(value="预支付交易会话ID", dataType="String")
    private String prepayid;

    @ApiModelProperty(value="商户号", dataType="String")
    private String partnerid;

    @ApiModelProperty(value="随机字符串", dataType="String")
    private String noncestr;

    @ApiModelProperty(value="签名", dataType="String")
    private String sign;

    @ApiModelProperty(value="时间戳", dataType="Long")
    private Long timestamp;


    public void payConsultOrderParam(String noncestr,String partnerid,String prepayid,String sign,long timestamp,String counsultId){
        this.noncestr=noncestr;
        this.partnerid=partnerid;
        this.prepayid=prepayid;
        this.sign=sign;
        this.timestamp=timestamp;
        this.counsultId=counsultId;
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

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
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

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
