package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class OnAccountCarteInfo {
    private Integer eciId;

    private String eciSwiftNumber;

    private Byte eciState;

    private Integer eciTableId;

    private Integer eciWaiterId;

    private Integer eciCashierId;

    private Integer eciCustomerId;

    private Integer eciMemId;

    private Integer eciDishNums;

    private Integer eciAmountPeoplo;

    private Date eciRepastTime;

    private Date eciBillTime;

    private BigDecimal eciConsumeAmount;

    private BigDecimal eciDiscount;

    private BigDecimal eciPaidAmount;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

    private byte[] eciRemark;

    public Integer getEciId() {
        return eciId;
    }

    public void setEciId(Integer eciId) {
        this.eciId = eciId;
    }

    public String getEciSwiftNumber() {
        return eciSwiftNumber;
    }

    public void setEciSwiftNumber(String eciSwiftNumber) {
        this.eciSwiftNumber = eciSwiftNumber == null ? null : eciSwiftNumber.trim();
    }

    public Byte getEciState() {
        return eciState;
    }

    public void setEciState(Byte eciState) {
        this.eciState = eciState;
    }

    public Integer getEciTableId() {
        return eciTableId;
    }

    public void setEciTableId(Integer eciTableId) {
        this.eciTableId = eciTableId;
    }

    public Integer getEciWaiterId() {
        return eciWaiterId;
    }

    public void setEciWaiterId(Integer eciWaiterId) {
        this.eciWaiterId = eciWaiterId;
    }

    public Integer getEciCashierId() {
        return eciCashierId;
    }

    public void setEciCashierId(Integer eciCashierId) {
        this.eciCashierId = eciCashierId;
    }

    public Integer getEciCustomerId() {
        return eciCustomerId;
    }

    public void setEciCustomerId(Integer eciCustomerId) {
        this.eciCustomerId = eciCustomerId;
    }

    public Integer getEciMemId() {
        return eciMemId;
    }

    public void setEciMemId(Integer eciMemId) {
        this.eciMemId = eciMemId;
    }

    public Integer getEciDishNums() {
        return eciDishNums;
    }

    public void setEciDishNums(Integer eciDishNums) {
        this.eciDishNums = eciDishNums;
    }

    public Integer getEciAmountPeoplo() {
        return eciAmountPeoplo;
    }

    public void setEciAmountPeoplo(Integer eciAmountPeoplo) {
        this.eciAmountPeoplo = eciAmountPeoplo;
    }

    public Date getEciRepastTime() {
        return eciRepastTime;
    }

    public void setEciRepastTime(Date eciRepastTime) {
        this.eciRepastTime = eciRepastTime;
    }

    public Date getEciBillTime() {
        return eciBillTime;
    }

    public void setEciBillTime(Date eciBillTime) {
        this.eciBillTime = eciBillTime;
    }

    public BigDecimal getEciConsumeAmount() {
        return eciConsumeAmount;
    }

    public void setEciConsumeAmount(BigDecimal eciConsumeAmount) {
        this.eciConsumeAmount = eciConsumeAmount;
    }

    public BigDecimal getEciDiscount() {
        return eciDiscount;
    }

    public void setEciDiscount(BigDecimal eciDiscount) {
        this.eciDiscount = eciDiscount;
    }

    public BigDecimal getEciPaidAmount() {
        return eciPaidAmount;
    }

    public void setEciPaidAmount(BigDecimal eciPaidAmount) {
        this.eciPaidAmount = eciPaidAmount;
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

    public byte[] getEciRemark() {
        return eciRemark;
    }

    public void setEciRemark(byte[] eciRemark) {
        this.eciRemark = eciRemark;
    }
}