package com.sunfield.microframe.params;

import com.sunfield.microframe.domain.JmAppUser;
import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/14
 */
@ApiModel(value="AppointmentParams", description="约见信息对象")
public class AppointmentParams{

    public AppointmentParams(){}

    public AppointmentParams(JmAppUser user,JmAppUser expert,String expertRealName,int state,String reason,Date createDate,Date updateDate){
        this.state=state;
        this.reason=reason;
        this.createDate=createDate;
        this.updateDate=updateDate;
        this.expertId=expert.getId();
        this.expertUsername=expert.getMobile();
        this.expertRealName=expertRealName;
        this.expertCompanyName=expert.getCompanyName();
        this.expertPhone=expert.getMobile();
        this.expertPost=user.getPost();
        this.industryId=expert.getIndustry();
        this.industryName=expert.getIndustryName();
        this.nickname=user.getNickName();
        this.username=user.getMobile();
        this.companyName=user.getCompanyName();
        this.headPicUrl=user.getHeadPicUrl();
        this.post=user.getPost();
        this.phone=user.getMobile();
    }

    @ApiModelProperty(value="专家ID", dataType="String")
    private String expertId;

    @ApiModelProperty(value="专家账号", dataType="String")
    private String expertUsername;

    @ApiModelProperty(value="专家真实姓名", dataType="String")
    private String expertRealName;

    @ApiModelProperty(value="专家公司", dataType="String")
    private String expertCompanyName;

    @ApiModelProperty(value="专家电话", dataType="String")
    private String expertPhone;

    @ApiModelProperty(value="专家职务", dataType="String")
    private String expertPost;

    @ApiModelProperty(value="行业ID", dataType="String")
    private String industryId;

    @ApiModelProperty(value="行业名称", dataType="String")
    private String industryName;

    @ApiModelProperty(value="状态：0待处理，1已同意，2已拒绝", dataType="String")
    private Integer state;

    @ApiModelProperty(value="约见人用户名字", dataType="String")
    private String username;

    @ApiModelProperty(value="约见人名字", dataType="String")
    private String nickname;

    @ApiModelProperty(value="约见人公司", dataType="String")
    private String companyName;

    @ApiModelProperty(value="约见人头像", dataType="String")
    private String headPicUrl;

    @ApiModelProperty(value="约见人职务", dataType="String")
    private String post;

    @ApiModelProperty(value="约见人电话", dataType="String")
    private String phone;

    @ApiModelProperty(value="约见理由", dataType="String")
    private String reason;

    @ApiModelProperty(value="创建时间", dataType="Date")
    private Date createDate;

    @ApiModelProperty(value="处理时间", dataType="Date")
    private Date updateDate;

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

    public String getExpertCompanyName() {
        return expertCompanyName;
    }

    public void setExpertCompanyName(String expertCompanyName) {
        this.expertCompanyName = expertCompanyName;
    }

    public String getExpertPhone() {
        return expertPhone;
    }

    public void setExpertPhone(String expertPhone) {
        this.expertPhone = expertPhone;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExpertPost() {
        return expertPost;
    }

    public void setExpertPost(String expertPost) {
        this.expertPost = expertPost;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadPicUrl() {
        return headPicUrl;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
