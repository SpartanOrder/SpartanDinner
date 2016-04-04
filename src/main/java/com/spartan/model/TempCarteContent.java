package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:临时餐单内容TCC .
 * @Date 2016/3/30 22:43
 */
public class TempCarteContent {
    private Integer tccId;

    private String tciSwiftNumber;

    private Dish dish;

    private Integer tccDishNum;

    private BigDecimal tccTotalPrice;

    private String tccSpecilDesc;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

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
}