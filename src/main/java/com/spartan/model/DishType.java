package com.spartan.model;

import java.util.Date;

public class DishType {
    private Integer dishTypeId;

    private String dishTypeName;

    private String dishTypeDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

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

    public Integer getSubby() {
        return subby;
    }

    public void setSubby(Integer subby) {
        this.subby = subby;
    }
}