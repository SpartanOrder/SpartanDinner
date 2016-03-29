package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class Region {
    private Byte regionid;

    private String regionname;

    private BigDecimal regionminconsume;

    private Integer regionmaxconsumer;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Byte getRegionid() {
        return regionid;
    }

    public void setRegionid(Byte regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public BigDecimal getRegionminconsume() {
        return regionminconsume;
    }

    public void setRegionminconsume(BigDecimal regionminconsume) {
        this.regionminconsume = regionminconsume;
    }

    public Integer getRegionmaxconsumer() {
        return regionmaxconsumer;
    }

    public void setRegionmaxconsumer(Integer regionmaxconsumer) {
        this.regionmaxconsumer = regionmaxconsumer;
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