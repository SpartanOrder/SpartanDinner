package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class MemberType {
    private Integer memTypeId;

    private String memTypeName;

    private BigDecimal memTypeDiscount;

    private String memTypeDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getMemTypeId() {
        return memTypeId;
    }

    public void setMemTypeId(Integer memTypeId) {
        this.memTypeId = memTypeId;
    }

    public String getMemTypeName() {
        return memTypeName;
    }

    public void setMemTypeName(String memTypeName) {
        this.memTypeName = memTypeName == null ? null : memTypeName.trim();
    }

    public BigDecimal getMemTypeDiscount() {
        return memTypeDiscount;
    }

    public void setMemTypeDiscount(BigDecimal memTypeDiscount) {
        this.memTypeDiscount = memTypeDiscount;
    }

    public String getMemTypeDesc() {
        return memTypeDesc;
    }

    public void setMemTypeDesc(String memTypeDesc) {
        this.memTypeDesc = memTypeDesc == null ? null : memTypeDesc.trim();
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
}