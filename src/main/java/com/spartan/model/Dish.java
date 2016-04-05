package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class Dish {
    private Integer dishId;

    private DishType dishType;

    private String dishName;

    private String dishSpeel;

    private BigDecimal dishCost;

    private String dishUnit;

    private BigDecimal dishPrice;

    private String dishDescription;

    private String dishCooking;

    private String dishImgUrl;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Dish() {
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        if (dishType.getDishTypeId() == null) {
            this.dishType = null;
        } else {
            this.dishType = dishType;
        }
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public String getDishSpeel() {
        return dishSpeel;
    }

    public void setDishSpeel(String dishSpeel) {
        this.dishSpeel = dishSpeel == null ? null : dishSpeel.trim();
    }

    public BigDecimal getDishCost() {
        return dishCost;
    }

    public void setDishCost(BigDecimal dishCost) {
        this.dishCost = dishCost;
    }

    public String getDishUnit() {
        return dishUnit;
    }

    public void setDishUnit(String dishUnit) {
        this.dishUnit = dishUnit == null ? null : dishUnit.trim();
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription == null ? null : dishDescription.trim();
    }

    public String getDishCooking() {
        return dishCooking;
    }

    public void setDishCooking(String dishCooking) {
        this.dishCooking = dishCooking == null ? null : dishCooking.trim();
    }

    public String getDishImgUrl() {
        return dishImgUrl;
    }

    public void setDishImgUrl(String dishImgUrl) {
        this.dishImgUrl = dishImgUrl == null ? null : dishImgUrl.trim();
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
        return "Dish{" +
                "dishId=" + dishId +
                ", dishType=" + dishType +
                ", dishName='" + dishName + '\'' +
                ", dishSpeel='" + dishSpeel + '\'' +
                ", dishCost=" + dishCost +
                ", dishUnit='" + dishUnit + '\'' +
                ", dishPrice=" + dishPrice +
                ", dishDescription='" + dishDescription + '\'' +
                ", dishCooking='" + dishCooking + '\'' +
                ", dishImgUrl='" + dishImgUrl + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", dish=" + user +
                '}';
    }
}