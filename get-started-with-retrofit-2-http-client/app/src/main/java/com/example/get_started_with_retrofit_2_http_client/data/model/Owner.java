package com.example.get_started_with_retrofit_2_http_client.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {
    @SerializedName("reputation")
    @Expose
    private Integer reputation;

    @SerializedName("user_id")
    @Expose
    private Integer userId;

    @SerializedName("user_type")
    @Expose
    private String userType;

    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    @SerializedName("display_name")
    @Expose
    private String displayName;

    @SerializedName("link")
    @Expose
    private String link;

    public Owner() {
    }

    public Owner(Integer reputation, Integer userId, String userType, String profileImage, String displayName, String link) {
        this.reputation = reputation;
        this.userId = userId;
        this.userType = userType;
        this.profileImage = profileImage;
        this.displayName = displayName;
        this.link = link;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
