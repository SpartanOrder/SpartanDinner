package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class TempCarteInfo {
    private Integer tciId;

    private String tciSwiftNumber;

    private Byte tciState;

    private Integer tciTableId;

    private Integer tciCustomerId;

    private Integer tciMemId;

    private Integer tciWaiterId;

    private Integer tciDishNums;

    private Integer tciAmountPeoplo;

    private Date tciRepastTime;

    private BigDecimal tciConsumeAmount;

    private BigDecimal tciCostAmount;

    private BigDecimal tciDiscount;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

    private byte[] tciRemark;

    public Integer getTciId() {
        return tciId;
    }

    public void setTciId(Integer tciId) {
        this.tciId = tciId;
    }

    public String getTciSwiftNumber() {
        return tciSwiftNumber;
    }

    public void setTciSwiftNumber(String tciSwiftNumber) {
        this.tciSwiftNumber = tciSwiftNumber == null ? null : tciSwiftNumber.trim();
    }

    public Byte getTciState() {
        return tciState;
    }

    public void setTciState(Byte tciState) {
        this.tciState = tciState;
    }

    public Integer getTciTableId() {
        return tciTableId;
    }

    public void setTciTableId(Integer tciTableId) {
        this.tciTableId = tciTableId;
    }

    public Integer getTciCustomerId() {
        return tciCustomerId;
    }

    public void setTciCustomerId(Integer tciCustomerId) {
        this.tciCustomerId = tciCustomerId;
    }

    public Integer getTciMemId() {
        return tciMemId;
    }

    public void setTciMemId(Integer tciMemId) {
        this.tciMemId = tciMemId;
    }

    public Integer getTciWaiterId() {
        return tciWaiterId;
    }

    public void setTciWaiterId(Integer tciWaiterId) {
        this.tciWaiterId = tciWaiterId;
    }

    public Integer getTciDishNums() {
        return tciDishNums;
    }

    public void setTciDishNums(Integer tciDishNums) {
        this.tciDishNums = tciDishNums;
    }

    public Integer getTciAmountPeoplo() {
        return tciAmountPeoplo;
    }

    public void setTciAmountPeoplo(Integer tciAmountPeoplo) {
        this.tciAmountPeoplo = tciAmountPeoplo;
    }

    public Date getTciRepastTime() {
        return tciRepastTime;
    }

    public void setTciRepastTime(Date tciRepastTime) {
        this.tciRepastTime = tciRepastTime;
    }

    public BigDecimal getTciConsumeAmount() {
        return tciConsumeAmount;
    }

    public void setTciConsumeAmount(BigDecimal tciConsumeAmount) {
        this.tciConsumeAmount = tciConsumeAmount;
    }

    public BigDecimal getTciCostAmount() {
        return tciCostAmount;
    }

    public void setTciCostAmount(BigDecimal tciCostAmount) {
        this.tciCostAmount = tciCostAmount;
    }

    public BigDecimal getTciDiscount() {
        return tciDiscount;
    }

    public void setTciDiscount(BigDecimal tciDiscount) {
        this.tciDiscount = tciDiscount;
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

    public byte[] getTciRemark() {
        return tciRemark;
    }

    public void setTciRemark(byte[] tciRemark) {
        this.tciRemark = tciRemark;
    }
}