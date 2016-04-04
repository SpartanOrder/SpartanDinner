package com.spartan.model;

import java.util.Date;

public class DishType {
    private Integer dishTypeId;

    private String dishTypeName;

    private String dishTypeDesc;

    private Byte dishTypeStatus;

    private Integer dishTypeOrderid;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public DishType() {
    }

    public Integer getDishTypeId() {
        return dishTypeId;
    }

    public void setDishTypeId(Integer dishTypeId) {
        this.dishTypeId = dishTypeId;
    }

    public String getDishTypeName() {
        return dishTypeName;
    }

    public void setDishTypeName(String dishTypeName) {
        this.dishTypeName = dishTypeName == null ? null : dishTypeName.trim();
    }

    public String getDishTypeDesc() {
        return dishTypeDesc;
    }

    public void setDishTypeDesc(String dishTypeDesc) {
        this.dishTypeDesc = dishTypeDesc == null ? null : dishTypeDesc.trim();
    }

    public Byte getDishTypeStatus() {
        return dishTypeStatus;
    }

    public void setDishTypeStatus(Byte dishTypeStatus) {
        this.dishTypeStatus = dishTypeStatus;
    }

    public Integer getDishTypeOrderid() {
        return dishTypeOrderid;
    }

    public void setDishTypeOrderid(Integer dishTypeOrderid) {
        this.dishTypeOrderid = dishTypeOrderid;
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
        return "DishType{" +
                "dishTypeId=" + dishTypeId +
                ", dishTypeName='" + dishTypeName + '\'' +
                ", dishTypeDesc='" + dishTypeDesc + '\'' +
                ", dishTypeStatus=" + dishTypeStatus +
                ", dishTypeOrderid=" + dishTypeOrderid +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}