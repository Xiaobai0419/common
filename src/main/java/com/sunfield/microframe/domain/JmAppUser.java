package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * jm_app_user bean
 * @author sunfield coder
 */
@ApiModel(value="JmAppUser", description="")
public class JmAppUser extends BaseDomain{

	@ApiModelProperty(value="手机号", dataType="String")
	private String mobile;

	@ApiModelProperty(value="昵称", dataType="String")
	private String nickName;

	@ApiModelProperty(value="签名", dataType="String")
	private String sign;

	@ApiModelProperty(value="公司名称", dataType="String")
	private String companyName;

	@ApiModelProperty(value="行业", dataType="String")
	private String industry;

	@ApiModelProperty(value="行业名称", dataType="String")
	private String industryName;

	@ApiModelProperty(value="职务", dataType="String")
	private String post;

	@ApiModelProperty(value="性别(1:男;2:女)", dataType="Integer")
	private Integer gender;

	@ApiModelProperty(value="头像url", dataType="String")
	private String headPicUrl;

	@ApiModelProperty(value="名片url", dataType="String")
	private String cardPicUrl;

	@ApiModelProperty(value="名片认证状态（0：未认证；1：认证中；2：已认证；3：已驳回）", dataType="Integer")
	private Integer cardStatus;

	@ApiModelProperty(value="马粮剩余数量(单位:分)", dataType="Integer")
	private Integer foodNum;

	@ApiModelProperty(value="积分剩余数量", dataType="Integer")
	private Integer scoreNum;

	@ApiModelProperty(value="好友数量", dataType="Integer")
	private Integer friendNum;

	@ApiModelProperty(value="咨询数量", dataType="Integer")
	private Integer consultNum;

	@ApiModelProperty(value="会员开始时间", dataType="Date")
	private Date memberStartTime;

	@ApiModelProperty(value="会员结束时间", dataType="Date")
	private Date memberEndTime;

	@ApiModelProperty(value="会员购买期限(单位:月)", dataType="Integer")
	private Integer memberMonth;

	@ApiModelProperty(value="会员状态(0:是;1:否)", dataType="Integer")
	private Integer memberStatus;

	@ApiModelProperty(value="企业号认证关联id", dataType="String")
	private String  businessAuthenticationId;

	@ApiModelProperty(value="微信openid", dataType="String")
	private String wxOpenId;

	@ApiModelProperty(value="qq openid", dataType="String")
	private String qqOpenId;

	@ApiModelProperty(value="新浪微博openid", dataType="String")
	private String sinaOpenId;

	@ApiModelProperty(value="微信昵称", dataType="String")
	private String wxNickName;

	@ApiModelProperty(value="qq昵称", dataType="String")
	private String qqNickName;

	@ApiModelProperty(value="新浪微博昵称", dataType="String")
	private String sinaNickName;

	@ApiModelProperty(value="专家认证状态（0：未认证；1：认证中；2：已认证；3：已驳回）", dataType="Integer")
	private Integer expertStatus;

	@ApiModelProperty(value="是否可以加我为好友(0:是;1:否)", dataType="Integer")
	private Integer friendStatus;

	@ApiModelProperty(value="融云token", dataType="String")
	private String rcToken;

	@ApiModelProperty(value="token", dataType="String")
	private String token;

	@ApiModelProperty(value="入群时间", dataType="Date")
	private Date groupAddDate;

	@ApiModelProperty(value="人脉关系(0 好友 1 对方已删除好友 2 好友请求中 3 对方已拒绝 4 无关联)", dataType="Integer")
	private Integer relationType;

	@ApiModelProperty(value="查询条件，起始注册时间", dataType="Date")
	private Date startCreateDate;

	@ApiModelProperty(value="查询条件，结束注册时间", dataType="Date")
	private Date endCreateDate;

    @ApiModelProperty(value="查询条件，用户认证状态(0:认证用户;1:普通用户)", dataType="Integer")
	private Integer userCardStatus;

	public Integer getRelationType() {
		return relationType;
	}

	public void setRelationType(Integer relationType) {
		this.relationType = relationType;
	}

	public Date getGroupAddDate() {
		return groupAddDate;
	}

	public void setGroupAddDate(Date groupAddDate) {
		this.groupAddDate = groupAddDate;
	}

	@NotBlank(message="手机号不能为空")
	@Length(min=0, max=16, message="手机号长度不能超过 16 个字符")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@NotBlank(message="昵称不能为空")
	@Length(min=0, max=64, message="昵称长度不能超过 64 个字符")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Length(min=0, max=128, message="签名长度不能超过 128 个字符")
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Length(min=0, max=64, message="公司名称长度不能超过 64 个字符")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Length(min=0, max=64, message="行业长度不能超过 64 个字符")
	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Length(min=0, max=64, message="职务长度不能超过 64 个字符")
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Length(min=0, max=256, message="头像url长度不能超过 256 个字符")
	public String getHeadPicUrl() {
		return headPicUrl;
	}

	public void setHeadPicUrl(String headPicUrl) {
		this.headPicUrl = headPicUrl;
	}

	@Length(min=0, max=256, message="名片url长度不能超过 256 个字符")
	public String getCardPicUrl() {
		return cardPicUrl;
	}

	public void setCardPicUrl(String cardPicUrl) {
		this.cardPicUrl = cardPicUrl;
	}

	public Integer getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(Integer cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Integer getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(Integer foodNum) {
		this.foodNum = foodNum;
	}

	public Integer getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum(Integer scoreNum) {
		this.scoreNum = scoreNum;
	}

	public Integer getFriendNum() {
		return friendNum;
	}

	public void setFriendNum(Integer friendNum) {
		this.friendNum = friendNum;
	}

	public Integer getConsultNum() {
		return consultNum;
	}

	public void setConsultNum(Integer consultNum) {
		this.consultNum = consultNum;
	}

	public Date getMemberStartTime() {
		return memberStartTime;
	}

	public void setMemberStartTime(Date memberStartTime) {
		this.memberStartTime = memberStartTime;
	}

	public Date getMemberEndTime() {
		return memberEndTime;
	}

	public void setMemberEndTime(Date memberEndTime) {
		this.memberEndTime = memberEndTime;
	}

	public Integer getMemberMonth() {
		return memberMonth;
	}

	public void setMemberMonth(Integer memberMonth) {
		this.memberMonth = memberMonth;
	}

	public Integer getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(Integer memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getBusinessAuthenticationId() {
		return businessAuthenticationId;
	}

	public void setBusinessAuthenticationId(String businessAuthenticationId) {
		this.businessAuthenticationId = businessAuthenticationId;
	}

	public String getWxOpenId() {
		return wxOpenId;
	}

	public void setWxOpenId(String wxOpenId) {
		this.wxOpenId = wxOpenId;
	}

	public String getQqOpenId() {
		return qqOpenId;
	}

	public void setQqOpenId(String qqOpenId) {
		this.qqOpenId = qqOpenId;
	}

	public String getSinaOpenId() {
		return sinaOpenId;
	}

	public void setSinaOpenId(String sinaOpenId) {
		this.sinaOpenId = sinaOpenId;
	}

	public String getWxNickName() {
		return wxNickName;
	}

	public void setWxNickName(String wxNickName) {
		this.wxNickName = wxNickName;
	}

	public String getQqNickName() {
		return qqNickName;
	}

	public void setQqNickName(String qqNickName) {
		this.qqNickName = qqNickName;
	}

	public String getSinaNickName() {
		return sinaNickName;
	}

	public void setSinaNickName(String sinaNickName) {
		this.sinaNickName = sinaNickName;
	}

	public Integer getExpertStatus() {
		return expertStatus;
	}

	public void setExpertStatus(Integer expertStatus) {
		this.expertStatus = expertStatus;
	}

	public Integer getFriendStatus() {
		return friendStatus;
	}

	public void setFriendStatus(Integer friendStatus) {
		this.friendStatus = friendStatus;
	}

	public String getRcToken() {
		return rcToken;
	}

	public void setRcToken(String rcToken) {
		this.rcToken = rcToken;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getStartCreateDate() {
		return startCreateDate;
	}

	public void setStartCreateDate(Date startCreateDate) {
		this.startCreateDate = startCreateDate;
	}

	public Date getEndCreateDate() {
		return endCreateDate;
	}

	public void setEndCreateDate(Date endCreateDate) {
		this.endCreateDate = endCreateDate;
	}

    public Integer getUserCardStatus() {
        return userCardStatus;
    }

    public void setUserCardStatus(Integer userCardStatus) {
        this.userCardStatus = userCardStatus;
    }
}