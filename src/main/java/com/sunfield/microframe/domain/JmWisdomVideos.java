package com.sunfield.microframe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * jm_wisdom_videos bean
 * @author sunfield coder
 */
@ApiModel(value="JmWisdomVideos", description="")
public class JmWisdomVideos extends BaseDomain{

	@ApiModelProperty(value="标题", dataType="String")
	private String title;
	
	@ApiModelProperty(value="访谈ID,关联角马访谈表ID", dataType="String")
	private String interviewId;
	
	@ApiModelProperty(value="封面地址", dataType="String")
	private String coverUrl;
	
	@ApiModelProperty(value="视频存储地址", dataType="String")
	private String videoUrl;
	
	@ApiModelProperty(value="是否允许评论和点赞，1允许，2不允许", dataType="Integer")
	private Integer allowComments;

	@ApiModelProperty(value="赞数,缓存，允许评论和点赞时记录值", dataType="Integer")
	private Integer ayes = 0;

	@ApiModelProperty(value="是否会员专属，1是，2否", dataType="Integer")
	private Integer leaguerOnly;
	
	@ApiModelProperty(value="免费时长，会员专属时才有值，可为空，空代表不限制，数值代表免费时长，单位秒", dataType="Integer")
	private Integer freeDuration = 0;

	@ApiModelProperty(value="访问用户ID,关联用户信息表ID", dataType="String")
	private String visitUserId;

	@ApiModelProperty(value="访问者对该视频的赞状态", dataType="Integer")
	private Integer visitUserYesOrNo = 0;

	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//用于接收json中特定形式格式化的日期字符串
	private Date dateStart;
	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date dateEnd;
	private List<String> interviewIdList;

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public List<String> getInterviewIdList() {
		return interviewIdList;
	}

	public void setInterviewIdList(List<String> interviewIdList) {
		this.interviewIdList = interviewIdList;
	}

	public String getVisitUserId() {
		return visitUserId;
	}

	public void setVisitUserId(String visitUserId) {
		this.visitUserId = visitUserId;
	}

	public Integer getVisitUserYesOrNo() {
		return visitUserYesOrNo;
	}

	public void setVisitUserYesOrNo(Integer visitUserYesOrNo) {
		this.visitUserYesOrNo = visitUserYesOrNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	
	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}
	
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	
	public Integer getAllowComments() {
		return allowComments;
	}

	public void setAllowComments(Integer allowComments) {
		this.allowComments = allowComments;
	}

	public Integer getAyes() {
		return ayes;
	}

	public void setAyes(Integer ayes) {
		this.ayes = ayes;
	}

	public Integer getLeaguerOnly() {
		return leaguerOnly;
	}

	public void setLeaguerOnly(Integer leaguerOnly) {
		this.leaguerOnly = leaguerOnly;
	}
	
	public Integer getFreeDuration() {
		return freeDuration;
	}

	public void setFreeDuration(Integer freeDuration) {
		this.freeDuration = freeDuration;
	}
	
}