package com.github.niu.user.server.models;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String realname;

    private String idNumber;

    private String schoolId;

    private String locationMessage;

    private String picture;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getLocationMessage() {
        return locationMessage;
    }

    public void setLocationMessage(String locationMessage) {
        this.locationMessage = locationMessage;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Driver{" +
        "userId=" + userId +
        ", realname=" + realname +
        ", idNumber=" + idNumber +
        ", schoolId=" + schoolId +
        ", locationMessage=" + locationMessage +
        ", picture=" + picture +
        "}";
    }
}
