package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class OnAccountCarteInfo {
    private Integer eciid;

    private String eciswiftnumber;

    private Byte ecistate;

    private Integer ecidtableid;

    private Integer eciwaiterid;

    private Integer ecicashierid;

    private Integer ecicustomerid;

    private Integer ecimemid;

    private Integer ecidishnums;

    private Integer eciamountpeoplo;

    private Date ecirepasttime;

    private Date ecibilltime;

    private BigDecimal eciconsumeamount;

    private BigDecimal ecidiscount;

    private BigDecimal ecipaidamount;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    private byte[] eciremark;

    public Integer getEciid() {
        return eciid;
    }

    public void setEciid(Integer eciid) {
        this.eciid = eciid;
    }

    public String getEciswiftnumber() {
        return eciswiftnumber;
    }

    public void setEciswiftnumber(String eciswiftnumber) {
        this.eciswiftnumber = eciswiftnumber == null ? null : eciswiftnumber.trim();
    }

    public Byte getEcistate() {
        return ecistate;
    }

    public void setEcistate(Byte ecistate) {
        this.ecistate = ecistate;
    }

    public Integer getEcidtableid() {
        return ecidtableid;
    }

    public void setEcidtableid(Integer ecidtableid) {
        this.ecidtableid = ecidtableid;
    }

    public Integer getEciwaiterid() {
        return eciwaiterid;
    }

    public void setEciwaiterid(Integer eciwaiterid) {
        this.eciwaiterid = eciwaiterid;
    }

    public Integer getEcicashierid() {
        return ecicashierid;
    }

    public void setEcicashierid(Integer ecicashierid) {
        this.ecicashierid = ecicashierid;
    }

    public Integer getEcicustomerid() {
        return ecicustomerid;
    }

    public void setEcicustomerid(Integer ecicustomerid) {
        this.ecicustomerid = ecicustomerid;
    }

    public Integer getEcimemid() {
        return ecimemid;
    }

    public void setEcimemid(Integer ecimemid) {
        this.ecimemid = ecimemid;
    }

    public Integer getEcidishnums() {
        return ecidishnums;
    }

    public void setEcidishnums(Integer ecidishnums) {
        this.ecidishnums = ecidishnums;
    }

    public Integer getEciamountpeoplo() {
        return eciamountpeoplo;
    }

    public void setEciamountpeoplo(Integer eciamountpeoplo) {
        this.eciamountpeoplo = eciamountpeoplo;
    }

    public Date getEcirepasttime() {
        return ecirepasttime;
    }

    public void setEcirepasttime(Date ecirepasttime) {
        this.ecirepasttime = ecirepasttime;
    }

    public Date getEcibilltime() {
        return ecibilltime;
    }

    public void setEcibilltime(Date ecibilltime) {
        this.ecibilltime = ecibilltime;
    }

    public BigDecimal getEciconsumeamount() {
        return eciconsumeamount;
    }

    public void setEciconsumeamount(BigDecimal eciconsumeamount) {
        this.eciconsumeamount = eciconsumeamount;
    }

    public BigDecimal getEcidiscount() {
        return ecidiscount;
    }

    public void setEcidiscount(BigDecimal ecidiscount) {
        this.ecidiscount = ecidiscount;
    }

    public BigDecimal getEcipaidamount() {
        return ecipaidamount;
    }

    public void setEcipaidamount(BigDecimal ecipaidamount) {
        this.ecipaidamount = ecipaidamount;
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

    public byte[] getEciremark() {
        return eciremark;
    }

    public void setEciremark(byte[] eciremark) {
        this.eciremark = eciremark;
    }
}