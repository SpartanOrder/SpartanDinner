package com.spartan.model;

import java.util.Date;

public class Customer {
    private Integer customerid;

    private String customername;

    private String customertel;

    private Byte customergender;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public Byte getCustomergender() {
        return customergender;
    }

    public void setCustomergender(Byte customergender) {
        this.customergender = customergender;
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