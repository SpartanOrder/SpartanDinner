package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class OnAccountCarteContent {
    private Integer eccId;

    private Integer eccDishId;

    private Integer eccDishNum;

    private BigDecimal eccTotalPrice;

    private Integer eccEciId;

    private String eccSpecilDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

    public Integer getEccId() {
        return eccId;
    }

    public void setEccId(Integer eccId) {
        this.eccId = eccId;
    }

    public Integer getEccDishId() {
        return eccDishId;
    }

    public void setEccDishId(Integer eccDishId) {
        this.eccDishId = eccDishId;
    }

    public Integer getEccDishNum() {
        return eccDishNum;
    }

    public void setEccDishNum(Integer eccDishNum) {
        this.eccDishNum = eccDishNum;
    }

    public BigDecimal getEccTotalPrice() {
        return eccTotalPrice;
    }

    public void setEccTotalPrice(BigDecimal eccTotalPrice) {
        this.eccTotalPrice = eccTotalPrice;
    }

    public Integer getEccEciId() {
        return eccEciId;
    }

    public void setEccEciId(Integer eccEciId) {
        this.eccEciId = eccEciId;
    }

    public String getEccSpecilDesc() {
        return eccSpecilDesc;
    }

    public void setEccSpecilDesc(String eccSpecilDesc) {
        this.eccSpecilDesc = eccSpecilDesc == null ? null : eccSpecilDesc.trim();
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