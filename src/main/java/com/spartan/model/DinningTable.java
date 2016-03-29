package com.spartan.model;

import java.util.Date;

public class DinningTable {
    private Integer dtableid;

    private Byte regionid;

    private String dtablename;

    private Byte dtablestate;

    private String dtabledesc;

    private Integer dmaxconsumer;

    private String dtableremark;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getDtableid() {
        return dtableid;
    }

    public void setDtableid(Integer dtableid) {
        this.dtableid = dtableid;
    }

    public Byte getRegionid() {
        return regionid;
    }

    public void setRegionid(Byte regionid) {
        this.regionid = regionid;
    }

    public String getDtablename() {
        return dtablename;
    }

    public void setDtablename(String dtablename) {
        this.dtablename = dtablename == null ? null : dtablename.trim();
    }

    public Byte getDtablestate() {
        return dtablestate;
    }

    public void setDtablestate(Byte dtablestate) {
        this.dtablestate = dtablestate;
    }

    public String getDtabledesc() {
        return dtabledesc;
    }

    public void setDtabledesc(String dtabledesc) {
        this.dtabledesc = dtabledesc == null ? null : dtabledesc.trim();
    }

    public Integer getDmaxconsumer() {
        return dmaxconsumer;
    }

    public void setDmaxconsumer(Integer dmaxconsumer) {
        this.dmaxconsumer = dmaxconsumer;
    }

    public String getDtableremark() {
        return dtableremark;
    }

    public void setDtableremark(String dtableremark) {
        this.dtableremark = dtableremark == null ? null : dtableremark.trim();
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