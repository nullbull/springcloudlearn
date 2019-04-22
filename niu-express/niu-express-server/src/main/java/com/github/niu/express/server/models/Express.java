package com.github.niu.express.server.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2019-04-22
 */
public class Express implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long orderId;

    private String packageType;

    /**
     * 快递类型
     */
    private Byte expressType;

    private String leaveNickname;

    private String leavePhone;

    /**
     * 取货码
     */
    private String getCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Byte getExpressType() {
        return expressType;
    }

    public void setExpressType(Byte expressType) {
        this.expressType = expressType;
    }

    public String getLeaveNickname() {
        return leaveNickname;
    }

    public void setLeaveNickname(String leaveNickname) {
        this.leaveNickname = leaveNickname;
    }

    public String getLeavePhone() {
        return leavePhone;
    }

    public void setLeavePhone(String leavePhone) {
        this.leavePhone = leavePhone;
    }

    public String getGetCode() {
        return getCode;
    }

    public void setGetCode(String getCode) {
        this.getCode = getCode;
    }

    @Override
    public String toString() {
        return "Express{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", packageType=" + packageType +
        ", expressType=" + expressType +
        ", leaveNickname=" + leaveNickname +
        ", leavePhone=" + leavePhone +
        ", getCode=" + getCode +
        "}";
    }
}
