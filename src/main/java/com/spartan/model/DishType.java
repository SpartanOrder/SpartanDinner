package com.spartan.model;

import java.util.Date;

public class DishType {
    private Byte dishtypeid;

    private String dishtypename;

    private String dishtypedesc;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Byte getDishtypeid() {
        return dishtypeid;
    }

    public void setDishtypeid(Byte dishtypeid) {
        this.dishtypeid = dishtypeid;
    }

    public String getDishtypename() {
        return dishtypename;
    }

    public void setDishtypename(String dishtypename) {
        this.dishtypename = dishtypename == null ? null : dishtypename.trim();
    }

    public String getDishtypedesc() {
        return dishtypedesc;
    }

    public void setDishtypedesc(String dishtypedesc) {
        this.dishtypedesc = dishtypedesc == null ? null : dishtypedesc.trim();
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