package com.spartan.model;

import java.util.Date;

public class Role {
    private Byte roleid;

    private String rolename;

    private String description;

    private String powerids;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Byte getRoleid() {
        return roleid;
    }

    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPowerids() {
        return powerids;
    }

    public void setPowerids(String powerids) {
        this.powerids = powerids == null ? null : powerids.trim();
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