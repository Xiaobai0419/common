package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

@ApiModel(value="ConsultParam", description="咨询信息传输对象")
public class ConsultParam {

    @ApiModelProperty(value="问题", dataType="String")
    private String question;

    @ApiModelProperty(value="咨询人名字", dataType="String")
    private String consultNickname;

    @ApiModelProperty(value="咨询人公司", dataType="String")
    private String consultCompanyName;

    @ApiModelProperty(value="咨询人头像", dataType="String")
    private String consultUserImg;

    @ApiModelProperty(value="专家ID", dataType="String")
    private String expertId;

    @ApiModelProperty(value="专家账号", dataType="String")
    private String expertUsername;

    @ApiModelProperty(value="专家真实姓名", dataType="String")
    private String expertRealName;

    @ApiModelProperty(value="状态:0代处理,1沟通中，2已结束，3已取消，4超时退款", dataType="Integer")
    private Integer state;

    @ApiModelProperty(value="咨询费用", dataType="BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value="是否旁听", dataType="Boolean")
    private Boolean listen;

    @ApiModelProperty(value="旁听数量", dataType="Integer")
    private Integer listenNum;



}
