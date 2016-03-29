package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class TempCarteInfo {
    private Integer tciid;

    private String tciswiftnumber;

    private Byte tcistate;

    private Integer tcidtableid;

    private Integer tcicustomerid;

    private Integer tcimemid;

    private Integer tciwaiterid;

    private Integer tcidishnums;

    private Integer tciamountpeoplo;

    private Date tcirepasttime;

    private BigDecimal tciconsumeamount;

    private BigDecimal tcicostamount;

    private BigDecimal tcidiscount;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    private byte[] tciremark;

    public Integer getTciid() {
        return tciid;
    }

    public void setTciid(Integer tciid) {
        this.tciid = tciid;
    }

    public String getTciswiftnumber() {
        return tciswiftnumber;
    }

    public void setTciswiftnumber(String tciswiftnumber) {
        this.tciswiftnumber = tciswiftnumber == null ? null : tciswiftnumber.trim();
    }

    public Byte getTcistate() {
        return tcistate;
    }

    public void setTcistate(Byte tcistate) {
        this.tcistate = tcistate;
    }

    public Integer getTcidtableid() {
        return tcidtableid;
    }

    public void setTcidtableid(Integer tcidtableid) {
        this.tcidtableid = tcidtableid;
    }

    public Integer getTcicustomerid() {
        return tcicustomerid;
    }

    public void setTcicustomerid(Integer tcicustomerid) {
        this.tcicustomerid = tcicustomerid;
    }

    public Integer getTcimemid() {
        return tcimemid;
    }

    public void setTcimemid(Integer tcimemid) {
        this.tcimemid = tcimemid;
    }

    public Integer getTciwaiterid() {
        return tciwaiterid;
    }

    public void setTciwaiterid(Integer tciwaiterid) {
        this.tciwaiterid = tciwaiterid;
    }

    public Integer getTcidishnums() {
        return tcidishnums;
    }

    public void setTcidishnums(Integer tcidishnums) {
        this.tcidishnums = tcidishnums;
    }

    public Integer getTciamountpeoplo() {
        return tciamountpeoplo;
    }

    public void setTciamountpeoplo(Integer tciamountpeoplo) {
        this.tciamountpeoplo = tciamountpeoplo;
    }

    public Date getTcirepasttime() {
        return tcirepasttime;
    }

    public void setTcirepasttime(Date tcirepasttime) {
        this.tcirepasttime = tcirepasttime;
    }

    public BigDecimal getTciconsumeamount() {
        return tciconsumeamount;
    }

    public void setTciconsumeamount(BigDecimal tciconsumeamount) {
        this.tciconsumeamount = tciconsumeamount;
    }

    public BigDecimal getTcicostamount() {
        return tcicostamount;
    }

    public void setTcicostamount(BigDecimal tcicostamount) {
        this.tcicostamount = tcicostamount;
    }

    public BigDecimal getTcidiscount() {
        return tcidiscount;
    }

    public void setTcidiscount(BigDecimal tcidiscount) {
        this.tcidiscount = tcidiscount;
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

    public byte[] getTciremark() {
        return tciremark;
    }

    public void setTciremark(byte[] tciremark) {
        this.tciremark = tciremark;
    }
}