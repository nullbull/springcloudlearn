package com.github.niu.express.server.models;

import com.baomidou.mybatisplus.annotation.TableId;
import com.github.niu.common.constants.Magic;

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
public class Ticket implements Serializable, Magic {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Long boatId;

    private Long userId;

    private BigDecimal price;

    private Byte packageType;

    private Long addressId;

    private Byte expressType;

    private String leavePhone;

    private String leaveName;

    private String code;

    private Byte status;

    private Date createAt;

    private Date updateAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoatId() {
        return boatId;
    }

    public void setBoatId(Long boatId) {
        this.boatId = boatId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getPackageType() {
        return packageType;
    }

    public void setPackageType(Byte packageType) {
        this.packageType = packageType;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Byte getExpressType() {
        return expressType;
    }

    public void setExpressType(Byte expressType) {
        this.expressType = expressType;
    }

    public String getLeavePhone() {
        return leavePhone;
    }

    public void setLeavePhone(String leavePhone) {
        this.leavePhone = leavePhone;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Ticket{" +
        "id=" + id +
        ", boatId=" + boatId +
        ", userId=" + userId +
        ", price=" + price +
        ", packageType=" + packageType +
        ", addressId=" + addressId +
        ", expressType=" + expressType +
        ", leavePhone=" + leavePhone +
        ", leaveName=" + leaveName +
        ", code=" + code +
        ", status=" + status +
        ", createAt=" + createAt +
        ", updateAt=" + updateAt +
        "}";
    }
}
