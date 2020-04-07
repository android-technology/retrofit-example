package com.example.get_started_with_retrofit_2_http_client.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("owner")
    @Expose
    private Owner owner;

    @SerializedName("is_accepted")
    @Expose
    private Boolean isAccepted;

    @SerializedName("score")
    @Expose
    private Integer score;

    @SerializedName("last_activity_data")
    @Expose
    private Integer lastActivityData;

    @SerializedName("last_edit_date")
    @Expose
    private Integer lastEditDate;

    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;

    @SerializedName("answer_id")
    @Expose
    private Integer answerId;

    @SerializedName("question_id")
    @Expose
    private Integer questionId;

    public Item() {
    }

    public Item(Owner owner, Boolean isAccepted, Integer score, Integer lastActivityData, Integer lastEditDate, Integer creationDate, Integer answerId, Integer questionId) {
        this.owner = owner;
        this.isAccepted = isAccepted;
        this.score = score;
        this.lastActivityData = lastActivityData;
        this.lastEditDate = lastEditDate;
        this.creationDate = creationDate;
        this.answerId = answerId;
        this.questionId = questionId;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityData() {
        return lastActivityData;
    }

    public void setLastActivityData(Integer lastActivityData) {
        this.lastActivityData = lastActivityData;
    }

    public Integer getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
