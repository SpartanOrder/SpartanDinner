package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class OnAccountCarteContent {
    private Integer eccid;

    private Integer eccdishid;

    private Byte eccdishnum;

    private BigDecimal ecctotalprice;

    private Integer ecceciid;

    private String eccspecildesc;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getEccid() {
        return eccid;
    }

    public void setEccid(Integer eccid) {
        this.eccid = eccid;
    }

    public Integer getEccdishid() {
        return eccdishid;
    }

    public void setEccdishid(Integer eccdishid) {
        this.eccdishid = eccdishid;
    }

    public Byte getEccdishnum() {
        return eccdishnum;
    }

    public void setEccdishnum(Byte eccdishnum) {
        this.eccdishnum = eccdishnum;
    }

    public BigDecimal getEcctotalprice() {
        return ecctotalprice;
    }

    public void setEcctotalprice(BigDecimal ecctotalprice) {
        this.ecctotalprice = ecctotalprice;
    }

    public Integer getEcceciid() {
        return ecceciid;
    }

    public void setEcceciid(Integer ecceciid) {
        this.ecceciid = ecceciid;
    }

    public String getEccspecildesc() {
        return eccspecildesc;
    }

    public void setEccspecildesc(String eccspecildesc) {
        this.eccspecildesc = eccspecildesc == null ? null : eccspecildesc.trim();
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