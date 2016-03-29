package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class TempCarteContent {
    private Integer tccid;

    private String tciswiftnumber;

    private Integer tccdishid;

    private Byte tccdishnum;

    private BigDecimal tcctotalprice;

    private String tccspecildesc;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getTccid() {
        return tccid;
    }

    public void setTccid(Integer tccid) {
        this.tccid = tccid;
    }

    public String getTciswiftnumber() {
        return tciswiftnumber;
    }

    public void setTciswiftnumber(String tciswiftnumber) {
        this.tciswiftnumber = tciswiftnumber == null ? null : tciswiftnumber.trim();
    }

    public Integer getTccdishid() {
        return tccdishid;
    }

    public void setTccdishid(Integer tccdishid) {
        this.tccdishid = tccdishid;
    }

    public Byte getTccdishnum() {
        return tccdishnum;
    }

    public void setTccdishnum(Byte tccdishnum) {
        this.tccdishnum = tccdishnum;
    }

    public BigDecimal getTcctotalprice() {
        return tcctotalprice;
    }

    public void setTcctotalprice(BigDecimal tcctotalprice) {
        this.tcctotalprice = tcctotalprice;
    }

    public String getTccspecildesc() {
        return tccspecildesc;
    }

    public void setTccspecildesc(String tccspecildesc) {
        this.tccspecildesc = tccspecildesc == null ? null : tccspecildesc.trim();
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