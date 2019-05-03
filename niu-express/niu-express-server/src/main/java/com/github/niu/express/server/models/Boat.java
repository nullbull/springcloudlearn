package com.github.niu.express.server.models;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public class Boat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Byte smallCount;

    private Byte normalCount;

    private Byte largeCount;

    private BigDecimal smallPrice;

    private BigDecimal normalPrice;

    private BigDecimal largePrice;

    private Date createAt;

    private Date updateAt;

    private Long driverId;

    private String driverNickname;

    private String desc;

    private Date beginAt;

    private Date endAt;

    private Byte status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getSmallCount() {
        return smallCount;
    }

    public void setSmallCount(Byte smallCount) {
        this.smallCount = smallCount;
    }

    public Byte getNormalCount() {
        return normalCount;
    }

    public void setNormalCount(Byte normalCount) {
        this.normalCount = normalCount;
    }

    public Byte getLargeCount() {
        return largeCount;
    }

    public void setLargeCount(Byte largeCount) {
        this.largeCount = largeCount;
    }

    public BigDecimal getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(BigDecimal smallPrice) {
        this.smallPrice = smallPrice;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    public BigDecimal getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(BigDecimal largePrice) {
        this.largePrice = largePrice;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getDriverNickname() {
        return driverNickname;
    }

    public void setDriverNickname(String driverNickname) {
        this.driverNickname = driverNickname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Date beginAt) {
        this.beginAt = beginAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", smallCount=" + smallCount +
                ", normalCount=" + normalCount +
                ", largeCount=" + largeCount +
                ", smallPrice=" + smallPrice +
                ", normalPrice=" + normalPrice +
                ", largePrice=" + largePrice +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", driverId=" + driverId +
                ", driverNickname='" + driverNickname + '\'' +
                ", desc='" + desc + '\'' +
                ", beginAt=" + beginAt +
                ", endAt=" + endAt +
                ", status=" + status +
                '}';
    }
}
