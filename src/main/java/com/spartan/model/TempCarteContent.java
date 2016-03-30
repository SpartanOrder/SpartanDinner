package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class TempCarteContent {
    private Integer tccId;

    private String tciSwiftNumber;

    private Integer tccDishId;

    private Integer tccDishNum;

    private BigDecimal tccTotalPrice;

    private String tccSpecilDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

    public Integer getTccId() {
        return tccId;
    }

    public void setTccId(Integer tccId) {
        this.tccId = tccId;
    }

    public String getTciSwiftNumber() {
        return tciSwiftNumber;
    }

    public void setTciSwiftNumber(String tciSwiftNumber) {
        this.tciSwiftNumber = tciSwiftNumber == null ? null : tciSwiftNumber.trim();
    }

    public Integer getTccDishId() {
        return tccDishId;
    }

    public void setTccDishId(Integer tccDishId) {
        this.tccDishId = tccDishId;
    }

    public Integer getTccDishNum() {
        return tccDishNum;
    }

    public void setTccDishNum(Integer tccDishNum) {
        this.tccDishNum = tccDishNum;
    }

    public BigDecimal getTccTotalPrice() {
        return tccTotalPrice;
    }

    public void setTccTotalPrice(BigDecimal tccTotalPrice) {
        this.tccTotalPrice = tccTotalPrice;
    }

    public String getTccSpecilDesc() {
        return tccSpecilDesc;
    }

    public void setTccSpecilDesc(String tccSpecilDesc) {
        this.tccSpecilDesc = tccSpecilDesc == null ? null : tccSpecilDesc.trim();
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