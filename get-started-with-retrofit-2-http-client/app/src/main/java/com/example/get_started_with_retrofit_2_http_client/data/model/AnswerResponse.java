package com.example.get_started_with_retrofit_2_http_client.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnswerResponse {
    @SerializedName("items")
    @Expose
    private List<Item> items;

    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;

    @SerializedName("quota_max")
    @Expose
    private Integer quotaMax;

    @SerializedName("quota_remaining")
    @Expose
    private Integer quotaRemaining;

    public AnswerResponse() {
    }

    public AnswerResponse(List<Item> items, Boolean hasMore, Integer quotaMax, Integer quotaRemaining) {
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }
}
