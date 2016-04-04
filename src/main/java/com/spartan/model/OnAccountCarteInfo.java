package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:挂账餐单信息OCI .
 * @Date 2016/3/30 22:43
 */
public class OnAccountCarteInfo {
    private Integer ociId;

    private String ociSwiftNumber;

    private Byte ociState;

    private DinningTable dinningTable;

    private EmployeeInfo ociWaiter;

    private EmployeeInfo ociCashier;

    private Customer customer;

    private MemberInfo memberInfo;

    private Integer ociDishNums;

    private Integer ociAmountPeoplo;

    private Date ociRepastTime;

    private BigDecimal ociConsumeAmount;

    private BigDecimal ociDiscount;

    private BigDecimal ociPaidAmount;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    private byte[] ociRemark;

    public Integer getOciId() {
        return ociId;
    }

    public void setOciId(Integer ociId) {
        this.ociId = ociId;
    }

    public String getOciSwiftNumber() {
        return ociSwiftNumber;
    }

    public void setOciSwiftNumber(String ociSwiftNumber) {
        this.ociSwiftNumber = ociSwiftNumber == null ? null : ociSwiftNumber.trim();
    }

    public Byte getOciState() {
        return ociState;
    }

    public void setOciState(Byte ociState) {
        this.ociState = ociState;
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

    public EmployeeInfo getOciWaiter() {
        return ociWaiter;
    }

    public void setOciWaiter(EmployeeInfo ociWaiter) {
        if (ociWaiter.getEmployeeId() == null) {
            this.ociWaiter = null;
        } else {
            this.ociWaiter = ociWaiter;
        }
    }

    public EmployeeInfo getOciCashier() {
        return ociCashier;
    }

    public void setOciCashier(EmployeeInfo ociCashier) {
        if (ociCashier.getEmployeeId() == null) {
            this.ociCashier = null;
        } else {
            this.ociCashier = ociCashier;
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


    public Integer getOciDishNums() {
        return ociDishNums;
    }

    public void setOciDishNums(Integer ociDishNums) {
        this.ociDishNums = ociDishNums;
    }

    public Integer getOciAmountPeoplo() {
        return ociAmountPeoplo;
    }

    public void setOciAmountPeoplo(Integer ociAmountPeoplo) {
        this.ociAmountPeoplo = ociAmountPeoplo;
    }

    public Date getOciRepastTime() {
        return ociRepastTime;
    }

    public void setOciRepastTime(Date ociRepastTime) {
        this.ociRepastTime = ociRepastTime;
    }

    public BigDecimal getOciConsumeAmount() {
        return ociConsumeAmount;
    }

    public void setOciConsumeAmount(BigDecimal ociConsumeAmount) {
        this.ociConsumeAmount = ociConsumeAmount;
    }

    public BigDecimal getOciDiscount() {
        return ociDiscount;
    }

    public void setOciDiscount(BigDecimal ociDiscount) {
        this.ociDiscount = ociDiscount;
    }

    public BigDecimal getOciPaidAmount() {
        return ociPaidAmount;
    }

    public void setOciPaidAmount(BigDecimal ociPaidAmount) {
        this.ociPaidAmount = ociPaidAmount;
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

    public byte[] getOciRemark() {
        return ociRemark;
    }

    public void setOciRemark(byte[] ociRemark) {
        this.ociRemark = ociRemark;
    }
}