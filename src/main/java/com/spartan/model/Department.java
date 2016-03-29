package com.spartan.model;

import java.util.Date;

public class Department {
    private Integer roleid;

    private String rolename;

    private Integer priority;

    private Long parentid;

    private String parentids;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
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