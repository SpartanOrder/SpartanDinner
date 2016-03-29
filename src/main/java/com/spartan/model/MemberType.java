package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class MemberType {
    private Integer memtypeid;

    private String memtypename;

    private BigDecimal memtypediscount;

    private String memtypedesc;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getMemtypeid() {
        return memtypeid;
    }

    public void setMemtypeid(Integer memtypeid) {
        this.memtypeid = memtypeid;
    }

    public String getMemtypename() {
        return memtypename;
    }

    public void setMemtypename(String memtypename) {
        this.memtypename = memtypename == null ? null : memtypename.trim();
    }

    public BigDecimal getMemtypediscount() {
        return memtypediscount;
    }

    public void setMemtypediscount(BigDecimal memtypediscount) {
        this.memtypediscount = memtypediscount;
    }

    public String getMemtypedesc() {
        return memtypedesc;
    }

    public void setMemtypedesc(String memtypedesc) {
        this.memtypedesc = memtypedesc == null ? null : memtypedesc.trim();
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