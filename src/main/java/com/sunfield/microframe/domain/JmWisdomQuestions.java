package com.sunfield.microframe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * jm_wisdom_questions bean
 * @author sunfield coder
 */
@ApiModel(value="JmWisdomQuestions", description="")
public class JmWisdomQuestions extends BaseDomain{

	@ApiModelProperty(value="标题", dataType="String")
	private String title;
	
	@ApiModelProperty(value="行业分类ID,关联行业分类表ID", dataType="String")
	private String industryId;
	
	@ApiModelProperty(value="提问者ID,关联用户信息表ID", dataType="String")
	private String userId;
	
	@ApiModelProperty(value="问题详情", dataType="String")
	private String content;

	@ApiModelProperty(value="上传媒体文件类型，1图片 2视频", dataType="Integer")
	private Integer mediaType;

	@ApiModelProperty(value="图片/视频存储地址,多个逗号分隔，OSS存储", dataType="String")
	private String ossUrls;
	
	@ApiModelProperty(value="赞数,缓存", dataType="Integer")
	private Integer ayes = 0;
	
	@ApiModelProperty(value="踩数,缓存", dataType="Integer")
	private Integer antis = 0;
	
	@ApiModelProperty(value="回答数", dataType="Integer")
	private Integer answers = 0;
	
	@ApiModelProperty(value="精品排序，从1开始，空代表非精品问答", dataType="Integer")
	private Integer selectOrder;

	private JmAppUser user;

	private JmIndustries industry;

	private JmWisdomAnswers firstAnswer;

	@ApiModelProperty(value="访问用户ID,关联用户信息表ID", dataType="String")
	private String visitUserId;

	@ApiModelProperty(value="访问者对该问题的踩赞状态", dataType="Integer")
	private Integer visitUserYesOrNo = 0;

	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//用于接收json中特定形式格式化的日期字符串
	private Date dateStart;
	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date dateEnd;
	private List<String> userIdList;

	public List<String> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

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

	public JmAppUser getUser() {
		return user;
	}

	public void setUser(JmAppUser user) {
		this.user = user;
	}

	public JmIndustries getIndustry() {
		return industry;
	}

	public void setIndustry(JmIndustries industry) {
		this.industry = industry;
	}

	public JmWisdomAnswers getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(JmWisdomAnswers firstAnswer) {
		this.firstAnswer = firstAnswer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getMediaType() {
		return mediaType;
	}

	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}

	public String getOssUrls() {
		return ossUrls;
	}

	public void setOssUrls(String ossUrls) {
		this.ossUrls = ossUrls;
	}
	
	public Integer getAyes() {
		return ayes;
	}

	public void setAyes(Integer ayes) {
		this.ayes = ayes;
	}
	
	public Integer getAntis() {
		return antis;
	}

	public void setAntis(Integer antis) {
		this.antis = antis;
	}
	
	public Integer getAnswers() {
		return answers;
	}

	public void setAnswers(Integer answers) {
		this.answers = answers;
	}
	
	public Integer getSelectOrder() {
		return selectOrder;
	}

	public void setSelectOrder(Integer selectOrder) {
		this.selectOrder = selectOrder;
	}

	public static void main(String[] args) {
		JmWisdomQuestions obj = new JmWisdomQuestions();
		System.out.println(obj.industryId);
		System.out.println(obj.getSelectOrder());
	}
}