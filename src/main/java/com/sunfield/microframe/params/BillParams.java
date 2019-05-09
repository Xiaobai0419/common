package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


@ApiModel(value="Bill", description="账单名称")
public class BillParams
{
    @ApiModelProperty(value="创建人ID", dataType="String")
    private String createBy;
    @ApiModelProperty(value="账单名称", dataType="String")
    private String name;
    @ApiModelProperty(value="金额", dataType="BigDecimal")
    private BigDecimal total;
    @ApiModelProperty(value="price", dataType="BigDecimal")
    private BigDecimal price;
    @ApiModelProperty(value="马粮", dataType="BigDecimal")
    private BigDecimal food;
    @ApiModelProperty(value="订单类型：（1，咨询订单，2旁听订单，3会议订单，4，会员订单，5提现订单）", dataType="Integer")
    private Integer orderType;
    @ApiModelProperty(value="订单ID", dataType="String")
    private String orderCode;


    public BillParams(){
    }

    public BillParams(String userId, String name, BigDecimal total, BigDecimal price, BigDecimal food, Integer orderType, String orderCode){
        this.createBy=userId;
        this.name=name;
        this.total=total;
        this.price=price;
        this.food=food;
        this.orderType=orderType;
        this.orderCode = orderCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFood() {
        return food;
    }

    public void setFood(BigDecimal food) {
        this.food = food;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}