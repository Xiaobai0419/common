package com.sunfield.microframe.params;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/14
 */
@ApiModel(value="Expert", description="专业对象")
public class ExpertParams extends BaseDomain {


    @ApiModelProperty(value="真实姓名", dataType="String")
    private String realName;

    @ApiModelProperty(value="手机号", dataType="String")
    private String phone;

    @ApiModelProperty(value="身份证号", dataType="String")
    private String idCode;

    @ApiModelProperty(value="头像", dataType="String")
    private String headImg;

    @ApiModelProperty(value="职位", dataType="String")
    private String title;

    @ApiModelProperty(value="名片认证状态（0：未认证；1：认证中；2：已认证；3：已驳回）", dataType="Integer")
    private Integer cardStatus;

    @ApiModelProperty(value="身份证正面图片", dataType="String")
    private String idCodeImg;

    @ApiModelProperty(value="身份证背面图片", dataType="String")
    private String idCodeBackImg;

    @ApiModelProperty(value="行业ID", dataType="String")
    private String industryId;

    @ApiModelProperty(value="行业名称", dataType="String")
    private String industryName;

    @ApiModelProperty(value="专家资质图片集合", dataType="String")
    private List<String> industryImgs;

    @ApiModelProperty(value="专家介绍", dataType="String")
    private String introduce;

    @ApiModelProperty(value="专家账号", dataType="String")
    private String username;

    @ApiModelProperty(value="专家昵称", dataType="String")
    private String nickname;

    @ApiModelProperty(value="是否推荐", dataType="Boolean")
    private Boolean recommend;

    @ApiModelProperty(value="推荐排序", dataType="Integer")
    private Integer recommendSort;

    @ApiModelProperty(value="咨询费用", dataType="BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value="回复时间:毫秒", dataType="Long")
    private Long replyTime;

    @ApiModelProperty(value="关闭时间:毫秒", dataType="Long")
    private Long closeTime;

    @ApiModelProperty(value="咨询数", dataType="Long")
    private Integer consultNum;

    @ApiModelProperty(value="分数", dataType="Float")
    private Float mark;

    @ApiModelProperty(value="性别(1:男;2:女)", dataType="Integer")
    private Integer gender;

    @JsonIgnore
    private String imgs;

    @ApiModelProperty(value="审核状态：0待审核，1已通过，2已拒绝", dataType="Integer")
    private Integer state;




    @Override
    public void preInsert(){
        Date d = new Date();
        super.setId(super.getCreateBy());
        super.setCreateDate(d);
        super.setUpdateDate(d);
        super.setStatus("0");
        this.state=0;
        this.consultNum=0;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    public String getRealName() {
        return realName;
    }



    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCodeImg() {
        return idCodeImg;
    }

    public void setIdCodeImg(String idCodeImg) {
        this.idCodeImg = idCodeImg;
    }

    public String getIdCodeBackImg() {
        return idCodeBackImg;
    }

    public void setIdCodeBackImg(String idCodeBackImg) {
        this.idCodeBackImg = idCodeBackImg;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public List<String> getIndustryImgs() {
        return industryImgs;
    }

    public void setIndustryImgs(List<String> industryImgs) {
        this.industryImgs = industryImgs;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
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

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getRecommendSort() {
        return recommendSort;
    }

    public void setRecommendSort(Integer recommendSort) {
        this.recommendSort = recommendSort;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Long replyTime) {
        this.replyTime = replyTime;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getConsultNum() {
        return consultNum;
    }

    public void setConsultNum(Integer consultNum) {
        this.consultNum = consultNum;
    }

    public Integer getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
