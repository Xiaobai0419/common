package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/19
 */
@ApiModel(value="FoodParams", description="马粮传输对象")
public class FoodParams {

    public FoodParams(){}

    public FoodParams(BigDecimal number,Integer type,String createId,String gainsUserId,String gainsRealName){
        this.number=number;
        this.type=type;
        this.createId=createId;
        this.gainsUserId=gainsUserId;
        this.gainsRealName=gainsRealName;
    }

    @ApiModelProperty(value="数量", dataType="BigDecimal")
    private BigDecimal number;

    @ApiModelProperty(value="类型:1咨询成功,2旁听,3咨询关闭,4提现,5未用马粮咨询,6未用马粮旁听", dataType="Integer")
    private Integer type;

    @ApiModelProperty(value="消费用户ID", dataType="String")
    private String createId;

    @ApiModelProperty(value="收益用户ID", dataType="String")
    private String gainsUserId;

    @ApiModelProperty(value="收益人名字(专家真实姓名)", dataType="String")
    private String gainsRealName;

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreateId() {
        return createId;
    }
    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getGainsUserId() {
        return gainsUserId;
    }

    public void setGainsUserId(String gainsUserId) {
        this.gainsUserId = gainsUserId;
    }

    public String getGainsRealName() {
        return gainsRealName;
    }

    public void setGainsRealName(String gainsRealName) {
        this.gainsRealName = gainsRealName;
    }
}
