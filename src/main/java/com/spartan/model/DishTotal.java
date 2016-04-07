package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class DishTotal {
    private Integer dishtotalId;

    private Dish dish;

    private Integer dishtotalYear;

    private Integer dishtotalMonth;

    private Integer dishtotalDay;

    private Integer dishtotalDaytime;

    private BigDecimal totalAmount;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getDishtotalId() {
        return dishtotalId;
    }

    public void setDishtotalId(Integer dishtotalId) {
        this.dishtotalId = dishtotalId;
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

    public Integer getDishtotalYear() {
        return dishtotalYear;
    }

    public void setDishtotalYear(Integer dishtotalYear) {
        this.dishtotalYear = dishtotalYear;
    }

    public Integer getDishtotalMonth() {
        return dishtotalMonth;
    }

    public void setDishtotalMonth(Integer dishtotalMonth) {
        this.dishtotalMonth = dishtotalMonth;
    }

    public Integer getDishtotalDay() {
        return dishtotalDay;
    }

    public void setDishtotalDay(Integer dishtotalDay) {
        this.dishtotalDay = dishtotalDay;
    }

    public Integer getDishtotalDaytime() {
        return dishtotalDaytime;
    }

    public void setDishtotalDaytime(Integer dishtotalDaytime) {
        this.dishtotalDaytime = dishtotalDaytime;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
        return "DishTotal{" +
                "dishtotalId=" + dishtotalId +
                ", dish=" + dish +
                ", dishtotalYear=" + dishtotalYear +
                ", dishtotalMonth=" + dishtotalMonth +
                ", dishtotalDay=" + dishtotalDay +
                ", dishtotalDaytime=" + dishtotalDaytime +
                ", totalAmount=" + totalAmount +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}