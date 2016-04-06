package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class Region {
    private Integer regionId;

    private String regionName;

    private BigDecimal regionMinConsume;

    private Integer regionMaxConsumer;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public BigDecimal getRegionMinConsume() {
        return regionMinConsume;
    }

    public void setRegionMinConsume(BigDecimal regionMinConsume) {
        this.regionMinConsume = regionMinConsume;
    }

    public Integer getRegionMaxConsumer() {
        return regionMaxConsumer;
    }

    public void setRegionMaxConsumer(Integer regionMaxConsumer) {
        this.regionMaxConsumer = regionMaxConsumer;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getLastSubtime() {
        return lastSubtime;
    }

    public void setLastSubtime(Date lastSubtime) {
        this.lastSubtime = lastSubtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if (user.getUserId() == null) {
            this.user = null;
        } else {
            this.user = user;
        }
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", regionName='" + regionName + '\'' +
                ", regionMinConsume=" + regionMinConsume +
                ", regionMaxConsumer=" + regionMaxConsumer +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}