package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

@ApiModel(value="ScoreDTO", description="积分展示传输对象")
public class ScoreDTO {
    @ApiModelProperty(value="每天获得的总积分", dataType="String")
    private Integer totalScore;
    @ApiModelProperty(value="每天获得的总积分", dataType="String")
    private Integer totalPercentage;
    @ApiModelProperty(value="文章积分百分比", dataType="String")
    private Integer readPercentage;
    @ApiModelProperty(value="问答积分百分比", dataType="String")
    private Integer questionPercentage;
    @ApiModelProperty(value="今天获得文章积分", dataType="String")
    private Integer readScore;
    @ApiModelProperty(value="今天获得问答积分", dataType="String")
    private Integer questionScore;
    @ApiModelProperty(value="每天最大获得文章积分", dataType="String")
    private Integer readScoreMax;
    @ApiModelProperty(value="每天最大获得问答积分", dataType="String")
    private Integer questionScoreMax;
    @ApiModelProperty(value="规制说明", dataType="String")
    private String readScoreRule;

    public ScoreDTO(){}

    public ScoreDTO(int totalScore,int totalPercentage,int readPercentage,int questionPercentage,int readScore,int questionScore,int readScoreMax,int questionScoreMax,String readScoreRule){
        this.totalScore=totalScore;
        this.totalPercentage=totalPercentage;
        this.readPercentage=readPercentage;
        this.questionPercentage=questionPercentage;
        this.readScore=readScore;
        this.questionScore=questionScore;
        this.readScoreMax=readScoreMax;
        this.questionScoreMax=questionScoreMax;
        this.readScoreRule=readScoreRule;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(Integer totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public Integer getReadPercentage() {
        return readPercentage;
    }

    public void setReadPercentage(Integer readPercentage) {
        this.readPercentage = readPercentage;
    }

    public Integer getQuestionPercentage() {
        return questionPercentage;
    }

    public void setQuestionPercentage(Integer questionPercentage) {
        this.questionPercentage = questionPercentage;
    }

    public Integer getReadScore() {
        return readScore;
    }

    public void setReadScore(Integer readScore) {
        this.readScore = readScore;
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getReadScoreMax() {
        return readScoreMax;
    }

    public void setReadScoreMax(Integer readScoreMax) {
        this.readScoreMax = readScoreMax;
    }

    public Integer getQuestionScoreMax() {
        return questionScoreMax;
    }

    public void setQuestionScoreMax(Integer questionScoreMax) {
        this.questionScoreMax = questionScoreMax;
    }

    public String getReadScoreRule() {
        return readScoreRule;
    }

    public void setReadScoreRule(String readScoreRule) {
        this.readScoreRule = readScoreRule;
    }
}
