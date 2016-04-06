package com.spartan.model;


import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:消费餐单信息ECC .
 * @Date 2016/3/30 22:43
 */
public class EndCarteContent {
    private Integer eccId;

    private EndCarteInfo endCarteInfo;

    private Dish dish;

    private Integer eccDishNum;

    private BigDecimal eccTotalPrice;

    private String eccSpecilDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public EndCarteContent() {
    }

    public Integer getEccId() {
        return eccId;
    }

    public void setEccId(Integer eccId) {
        this.eccId = eccId;
    }

    public EndCarteInfo getEndCarteInfo() {
        return endCarteInfo;
    }

    public void setEndCarteInfo(EndCarteInfo endCarteInfo) {
        if (endCarteInfo.getEciId() == null) {
            this.endCarteInfo = null;
        } else {
            this.endCarteInfo = endCarteInfo;
        }
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        if (dish.getDishId() == null) {
            this.dish = null;
        } else {
            this.dish = dish;
        }
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
        return "EndCarteContent{" +
                "eccId=" + eccId +
                ", endCarteInfo=" + endCarteInfo +
                ", dish=" + dish +
                ", eccDishNum=" + eccDishNum +
                ", eccTotalPrice=" + eccTotalPrice +
                ", eccSpecilDesc='" + eccSpecilDesc + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}