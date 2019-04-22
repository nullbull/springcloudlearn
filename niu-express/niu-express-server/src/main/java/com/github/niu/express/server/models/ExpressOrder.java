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
 * @since 2019-04-22
 */
public class ExpressOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long neederId;

    private String neederNickname;

    private String providerNickname;

    private Long providerId;

    private BigDecimal price;

    private Byte locationId;

    private Byte score;

    private Byte status;

    private Date createdAt;

    private Date updatedAt;

    private Date finishedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNeederId() {
        return neederId;
    }

    public void setNeederId(Long neederId) {
        this.neederId = neederId;
    }

    public String getNeederNickname() {
        return neederNickname;
    }

    public void setNeederNickname(String neederNickname) {
        this.neederNickname = neederNickname;
    }

    public String getProviderNickname() {
        return providerNickname;
    }

    public void setProviderNickname(String providerNickname) {
        this.providerNickname = providerNickname;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getLocationId() {
        return locationId;
    }

    public void setLocationId(Byte locationId) {
        this.locationId = locationId;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
        "id=" + id +
        ", neederId=" + neederId +
        ", neederNickname=" + neederNickname +
        ", providerNickname=" + providerNickname +
        ", providerId=" + providerId +
        ", price=" + price +
        ", locationId=" + locationId +
        ", score=" + score +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", finishedAt=" + finishedAt +
        "}";
    }
}
