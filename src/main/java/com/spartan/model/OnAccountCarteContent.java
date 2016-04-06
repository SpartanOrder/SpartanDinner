package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:挂账餐单内容OCC .
 * @Date 2016/3/30 22:43
 */
public class OnAccountCarteContent {
    private Integer occId;

    private OnAccountCarteInfo onAccountCarteInfo;

    private Dish dish;

    private Integer occDishNum;

    private BigDecimal occTotalPrice;

    private String occSpecilDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getOccId() {
        return occId;
    }

    public void setOccId(Integer occId) {
        this.occId = occId;
    }

    public OnAccountCarteInfo getOnAccountCarteInfo() {
        return onAccountCarteInfo;
    }

    public void setOnAccountCarteInfo(OnAccountCarteInfo onAccountCarteInfo) {
        if (onAccountCarteInfo.getOciId() == null) {
            this.onAccountCarteInfo = null;
        } else {
            this.onAccountCarteInfo = onAccountCarteInfo;
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

    public Integer getOccDishNum() {
        return occDishNum;
    }

    public void setOccDishNum(Integer occDishNum) {
        this.occDishNum = occDishNum;
    }

    public BigDecimal getOccTotalPrice() {
        return occTotalPrice;
    }

    public void setOccTotalPrice(BigDecimal occTotalPrice) {
        this.occTotalPrice = occTotalPrice;
    }

    public String getOccSpecilDesc() {
        return occSpecilDesc;
    }

    public void setOccSpecilDesc(String occSpecilDesc) {
        this.occSpecilDesc = occSpecilDesc == null ? null : occSpecilDesc.trim();
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
        return "OnAccountCarteContent{" +
                "occId=" + occId +
                ", onAccountCarteInfo=" + onAccountCarteInfo +
                ", dish=" + dish +
                ", occDishNum=" + occDishNum +
                ", occTotalPrice=" + occTotalPrice +
                ", occSpecilDesc='" + occSpecilDesc + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}