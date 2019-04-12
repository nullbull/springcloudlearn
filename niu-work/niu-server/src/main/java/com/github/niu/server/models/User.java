package com.github.niu.server.models;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2019-04-10
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userName;

    private String passWord;

    private Integer salt;

    /**
     * 邮件
     */
    private String email;

    /**
     * 专业编号
     */
    private String majorId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 宿舍号
     */
    private Byte locationId;

    /**
     * 1用户2跑腿3都是
     */
    private Byte type;

    /**
     * 支付宝
     */
    private String alipayId;

    /**
     * 微信
     */
    private String wechatId;

    /**
     * QQ
     */
    private String qqNumber;

    private String picture;

    /**
     * 如果用户类型为2，3必填
     */
    private String studentId;

    private Date createdAt;

    private Date updatedAt;

    /**
     * 1用户2系统
     */
    private Byte modifyBy;

    private String loginIp;

    private Date lastLogin;

    private String nickName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getSalt() {
        return salt;
    }

    public void setSalt(Integer salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getLocationId() {
        return locationId;
    }

    public void setLocationId(Byte locationId) {
        this.locationId = locationId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getAlipayId() {
        return alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Byte getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Byte modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", passWord=" + passWord +
        ", salt=" + salt +
        ", email=" + email +
        ", majorId=" + majorId +
        ", phone=" + phone +
        ", locationId=" + locationId +
        ", type=" + type +
        ", alipayId=" + alipayId +
        ", wechatId=" + wechatId +
        ", qqNumber=" + qqNumber +
        ", picture=" + picture +
        ", studentId=" + studentId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", modifyBy=" + modifyBy +
        ", loginIp=" + loginIp +
        ", lastLogin=" + lastLogin +
        ", nickName=" + nickName +
        "}";
    }
}
