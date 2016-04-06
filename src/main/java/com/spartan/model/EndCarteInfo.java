package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:消费餐单内容ECI .
 * @Date 2016/3/30 22:43
 */
public class EndCarteInfo {
    private Integer eciId;

    private String eciSwiftNumber;

    private Byte eciState;

    private DinningTable dinningTable;

    private EmployeeInfo eciWaiter;

    private EmployeeInfo eciCashier;

    private Customer customer;

    private MemberInfo memberInfo;

    private Integer eciDishNums;

    private Integer eciAmountPeoplo;

    private Date eciRepastTime;

    private Date eciBillTime;

    private String eciPayMethod;

    private BigDecimal eciConsumeAmount;

    private BigDecimal eciDiscount;

    private BigDecimal eciPaidAmount;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    private String eciRemark;

    private List<EndCarteContent> endCarteContentList;

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

    public DinningTable getDinningTable() {
        return dinningTable;
    }

    public void setDinningTable(DinningTable dinningTable) {
        if (dinningTable.getTableId() == null) {
            this.dinningTable = null;
        } else {
            this.dinningTable = dinningTable;
        }
    }

    public EmployeeInfo getEciWaiter() {
        return eciWaiter;
    }

    public void setEciWaiter(EmployeeInfo eciWaiter) {
        if (eciWaiter.getEmployeeId() == null) {
            this.eciWaiter = null;
        } else {
            this.eciWaiter = eciWaiter;
        }
    }

    public EmployeeInfo getEciCashier() {
        return eciCashier;
    }

    public void setEciCashier(EmployeeInfo eciCashier) {
        if (eciCashier.getEmployeeId() == null) {
            this.eciCashier = null;
        } else {
            this.eciCashier = eciCashier;
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer.getCustomerId() == null) {
            this.customer = null;
        } else {
            this.customer = customer;
        }
    }

    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfo memberInfo) {
        if (memberInfo.getMemId() == null) {
            this.memberInfo = null;
        } else {
            this.memberInfo = memberInfo;
        }
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

    public String getEciPayMethod() {
        return eciPayMethod;
    }

    public void setEciPayMethod(String eciPayMethod) {
        this.eciPayMethod = eciPayMethod == null ? null : eciPayMethod.trim();
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

    public String getEciRemark() {
        return eciRemark;
    }

    public void setEciRemark(String eciRemark) {
        this.eciRemark = eciRemark;
    }

    public List<EndCarteContent> getEndCarteContentList() {
        return endCarteContentList;
    }

    public void setEndCarteContentList(List<EndCarteContent> endCarteContentList) {
        this.endCarteContentList = endCarteContentList;
    }

    @Override
    public String toString() {
        return "EndCarteInfo{" +
                "eciId=" + eciId +
                ", eciSwiftNumber='" + eciSwiftNumber + '\'' +
                ", eciState=" + eciState +
                ", dinningTable=" + dinningTable +
                ", eciWaiter=" + eciWaiter +
                ", eciCashier=" + eciCashier +
                ", customer=" + customer +
                ", memberInfo=" + memberInfo +
                ", eciDishNums=" + eciDishNums +
                ", eciAmountPeoplo=" + eciAmountPeoplo +
                ", eciRepastTime=" + eciRepastTime +
                ", eciBillTime=" + eciBillTime +
                ", eciPayMethod='" + eciPayMethod + '\'' +
                ", eciConsumeAmount=" + eciConsumeAmount +
                ", eciDiscount=" + eciDiscount +
                ", eciPaidAmount=" + eciPaidAmount +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                ", eciRemark='" + eciRemark + '\'' +
                ", endCarteContentList=" + endCarteContentList +
                '}';
    }
}