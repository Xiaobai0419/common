package com.sunfield.microframe.params;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ApiModel(value="ConsultDTO", description="咨询传输对象")
public class ConsultDTO {
    @ApiModelProperty(value="问题", dataType="String",required=true)
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

    @ApiModelProperty(value="专家头像", dataType="String")
    private String expertHead;

    @ApiModelProperty(value="状态:0代处理,1沟通中，2已结束，3已取消，4超时退款,5待支付，4已支付", dataType="Integer")
    private Integer state;

    @ApiModelProperty(value="咨询费用", dataType="BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value="是否设为旁听对象", dataType="Boolean")
    private Boolean listen;

    @ApiModelProperty(value="类型：1咨询2旁听", dataType="Boolean")
    private Integer type;

    @ApiModelProperty(value="旁听数量", dataType="Integer")
    private Integer listenNum;


    @ApiModelProperty(value="行业ID", dataType="String")
    private String industryId;

    @ApiModelProperty(value="是否未读", dataType="String")
    private Integer isNew=0;

    @ApiModelProperty(value="语音", dataType="String")
    private String voice;

    @ApiModelProperty(value="视频或图片集", dataType="String")
    private String[] imgs;

    @ApiModelProperty(value="是否是视频:0不是 1是", dataType="String")
    private Integer video;

    @ApiModelProperty(value="视频封面", dataType="String")
    private String videoImg;

    @ApiModelProperty(value="关闭时间", dataType="Date")
    private Date closeDate;


    @ApiModelProperty(value="语音长度", dataType="Integer")
    private Integer voiceLong;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getConsultNickname() {
        return consultNickname;
    }

    public void setConsultNickname(String consultNickname) {
        this.consultNickname = consultNickname;
    }

    public String getConsultCompanyName() {
        return consultCompanyName;
    }

    public void setConsultCompanyName(String consultCompanyName) {
        this.consultCompanyName = consultCompanyName;
    }

    public String getConsultUserImg() {
        return consultUserImg;
    }

    public void setConsultUserImg(String consultUserImg) {
        this.consultUserImg = consultUserImg;
    }

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    public String getExpertUsername() {
        return expertUsername;
    }

    public void setExpertUsername(String expertUsername) {
        this.expertUsername = expertUsername;
    }

    public String getExpertRealName() {
        return expertRealName;
    }

    public void setExpertRealName(String expertRealName) {
        this.expertRealName = expertRealName;
    }

    public String getExpertHead() {
        return expertHead;
    }

    public void setExpertHead(String expertHead) {
        this.expertHead = expertHead;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getListen() {
        return listen;
    }

    public void setListen(Boolean listen) {
        this.listen = listen;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getListenNum() {
        return listenNum;
    }

    public void setListenNum(Integer listenNum) {
        this.listenNum = listenNum;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public Integer getVideo() {
        return video;
    }

    public void setVideo(Integer video) {
        this.video = video;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getVoiceLong() {
        return voiceLong;
    }

    public void setVoiceLong(Integer voiceLong) {
        this.voiceLong = voiceLong;
    }
}
