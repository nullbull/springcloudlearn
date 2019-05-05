package com.github.niu.user.server.models;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2019-05-05
 */
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private String leaveName;

    private String leavePhone;

    private Byte locationId;

    private Byte status;

    private String locationName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getLeavePhone() {
        return leavePhone;
    }

    public void setLeavePhone(String leavePhone) {
        this.leavePhone = leavePhone;
    }

    public Byte getLocationId() {
        return locationId;
    }

    public void setLocationId(Byte locationId) {
        this.locationId = locationId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return "Address{" +
        "id=" + id +
        ", userId=" + userId +
        ", leaveName=" + leaveName +
        ", leavePhone=" + leavePhone +
        ", locationId=" + locationId +
        ", status=" + status +
        ", locationName=" + locationName +
        "}";
    }
}
