package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class Dish {
    private Integer dishid;

    private Byte dishtypeid;

    private String dishname;

    private String dishspeel;

    private BigDecimal dishcost;

    private String dishunit;

    private BigDecimal dishprice;

    private String dishdescription;

    private String dishcooking;

    private String dishimgurl;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public Byte getDishtypeid() {
        return dishtypeid;
    }

    public void setDishtypeid(Byte dishtypeid) {
        this.dishtypeid = dishtypeid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public String getDishspeel() {
        return dishspeel;
    }

    public void setDishspeel(String dishspeel) {
        this.dishspeel = dishspeel == null ? null : dishspeel.trim();
    }

    public BigDecimal getDishcost() {
        return dishcost;
    }

    public void setDishcost(BigDecimal dishcost) {
        this.dishcost = dishcost;
    }

    public String getDishunit() {
        return dishunit;
    }

    public void setDishunit(String dishunit) {
        this.dishunit = dishunit == null ? null : dishunit.trim();
    }

    public BigDecimal getDishprice() {
        return dishprice;
    }

    public void setDishprice(BigDecimal dishprice) {
        this.dishprice = dishprice;
    }

    public String getDishdescription() {
        return dishdescription;
    }

    public void setDishdescription(String dishdescription) {
        this.dishdescription = dishdescription == null ? null : dishdescription.trim();
    }

    public String getDishcooking() {
        return dishcooking;
    }

    public void setDishcooking(String dishcooking) {
        this.dishcooking = dishcooking == null ? null : dishcooking.trim();
    }

    public String getDishimgurl() {
        return dishimgurl;
    }

    public void setDishimgurl(String dishimgurl) {
        this.dishimgurl = dishimgurl == null ? null : dishimgurl.trim();
    }

    public Byte getDelflag() {
        return delflag;
    }

    public void setDelflag(Byte delflag) {
        this.delflag = delflag;
    }

    public Date getLastsubtime() {
        return lastsubtime;
    }

    public void setLastsubtime(Date lastsubtime) {
        this.lastsubtime = lastsubtime;
    }

    public Integer getSubby() {
        return subby;
    }

    public void setSubby(Integer subby) {
        this.subby = subby;
    }
}