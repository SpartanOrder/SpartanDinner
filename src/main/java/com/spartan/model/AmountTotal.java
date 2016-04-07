package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class AmountTotal {
    private Integer totalId;

    private Integer totalYear;

    private Integer totalMonth;

    private Integer totalDay;

    private Integer totalDaytime;

    private Integer totalNum;

    private Integer totalEndNum;

    private Integer totalOnaccountNum;

    private BigDecimal totalAmount;

    private BigDecimal totalEndAmount;

    private BigDecimal totalOnaccountAmount;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getTotalId() {
        return totalId;
    }

    public void setTotalId(Integer totalId) {
        this.totalId = totalId;
    }

    public Integer getTotalYear() {
        return totalYear;
    }

    public void setTotalYear(Integer totalYear) {
        this.totalYear = totalYear;
    }

    public Integer getTotalMonth() {
        return totalMonth;
    }

    public void setTotalMonth(Integer totalMonth) {
        this.totalMonth = totalMonth;
    }

    public Integer getTotalDay() {
        return totalDay;
    }

    public void setTotalDay(Integer totalDay) {
        this.totalDay = totalDay;
    }

    public Integer getTotalDaytime() {
        return totalDaytime;
    }

    public void setTotalDaytime(Integer totalDaytime) {
        this.totalDaytime = totalDaytime;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalEndNum() {
        return totalEndNum;
    }

    public void setTotalEndNum(Integer totalEndNum) {
        this.totalEndNum = totalEndNum;
    }

    public Integer getTotalOnaccountNum() {
        return totalOnaccountNum;
    }

    public void setTotalOnaccountNum(Integer totalOnaccountNum) {
        this.totalOnaccountNum = totalOnaccountNum;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalEndAmount() {
        return totalEndAmount;
    }

    public void setTotalEndAmount(BigDecimal totalEndAmount) {
        this.totalEndAmount = totalEndAmount;
    }

    public BigDecimal getTotalOnaccountAmount() {
        return totalOnaccountAmount;
    }

    public void setTotalOnaccountAmount(BigDecimal totalOnaccountAmount) {
        this.totalOnaccountAmount = totalOnaccountAmount;
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
        return "AmountTotal{" +
                "totalId=" + totalId +
                ", totalYear=" + totalYear +
                ", totalMonth=" + totalMonth +
                ", totalDay=" + totalDay +
                ", totalDaytime=" + totalDaytime +
                ", totalNum=" + totalNum +
                ", totalEndNum=" + totalEndNum +
                ", totalOnaccountNum=" + totalOnaccountNum +
                ", totalAmount=" + totalAmount +
                ", totalEndAmount=" + totalEndAmount +
                ", totalOnaccountAmount=" + totalOnaccountAmount +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}