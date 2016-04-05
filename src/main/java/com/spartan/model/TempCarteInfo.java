package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:挂账餐单内容TCI .
 * @Date 2016/3/30 22:43
 */
public class TempCarteInfo {
    private Integer tciId;

    private String tciSwiftNumber;

    private Byte tciState;

    private DinningTable dinningTable;

    private EmployeeInfo tciWaiter;

    private Customer customer;

    private MemberInfo memberInfo;

    private Integer tciDishNums;

    private Integer tciAmountPeoplo;

    private Date tciRepastTime;

    private BigDecimal tciConsumeAmount;

    private BigDecimal tciCostAmount;

    private BigDecimal tciDiscount;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    private String tciRemark;

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

    public EmployeeInfo getTciWaiter() {
        return tciWaiter;
    }

    public void setTciWaiter(EmployeeInfo tciWaiter) {
        if (tciWaiter.getEmployeeId() == null) {
            this.tciWaiter = null;
        } else {
            this.tciWaiter = tciWaiter;
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

    public String getTciRemark() {
        return tciRemark;
    }

    public void setTciRemark(String tciRemark) {
        this.tciRemark = tciRemark;
    }
}