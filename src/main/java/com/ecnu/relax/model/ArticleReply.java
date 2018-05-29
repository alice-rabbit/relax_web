package com.ecnu.relax.model;

import java.util.Date;

public class ArticleReply {
    private Integer articleReplyId;

    private Integer specialistId;

    private Integer articleId;

    private Integer reReplyId;

    private Date replyTime;

    private String content;

    public Integer getArticleReplyId() {
        return articleReplyId;
    }

    public void setArticleReplyId(Integer articleReplyId) {
        this.articleReplyId = articleReplyId;
    }

    public Integer getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(Integer specialistId) {
        this.specialistId = specialistId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getReReplyId() {
        return reReplyId;
    }

    public void setReReplyId(Integer reReplyId) {
        this.reReplyId = reReplyId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}