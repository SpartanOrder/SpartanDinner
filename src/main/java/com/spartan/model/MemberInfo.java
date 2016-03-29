package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class MemberInfo {
    private Integer memid;

    private Integer memtypeid;

    private String memname;

    private String memusername;

    private String mempassword;

    private String memtel;

    private String memphone;

    private String memaddress;

    private Byte memgender;

    private BigDecimal memmoney;

    private Integer memintegral;

    private Date membirthday;

    private Date membegintime;

    private Date memendtime;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getMemid() {
        return memid;
    }

    public void setMemid(Integer memid) {
        this.memid = memid;
    }

    public Integer getMemtypeid() {
        return memtypeid;
    }

    public void setMemtypeid(Integer memtypeid) {
        this.memtypeid = memtypeid;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname == null ? null : memname.trim();
    }

    public String getMemusername() {
        return memusername;
    }

    public void setMemusername(String memusername) {
        this.memusername = memusername == null ? null : memusername.trim();
    }

    public String getMempassword() {
        return mempassword;
    }

    public void setMempassword(String mempassword) {
        this.mempassword = mempassword == null ? null : mempassword.trim();
    }

    public String getMemtel() {
        return memtel;
    }

    public void setMemtel(String memtel) {
        this.memtel = memtel == null ? null : memtel.trim();
    }

    public String getMemphone() {
        return memphone;
    }

    public void setMemphone(String memphone) {
        this.memphone = memphone == null ? null : memphone.trim();
    }

    public String getMemaddress() {
        return memaddress;
    }

    public void setMemaddress(String memaddress) {
        this.memaddress = memaddress == null ? null : memaddress.trim();
    }

    public Byte getMemgender() {
        return memgender;
    }

    public void setMemgender(Byte memgender) {
        this.memgender = memgender;
    }

    public BigDecimal getMemmoney() {
        return memmoney;
    }

    public void setMemmoney(BigDecimal memmoney) {
        this.memmoney = memmoney;
    }

    public Integer getMemintegral() {
        return memintegral;
    }

    public void setMemintegral(Integer memintegral) {
        this.memintegral = memintegral;
    }

    public Date getMembirthday() {
        return membirthday;
    }

    public void setMembirthday(Date membirthday) {
        this.membirthday = membirthday;
    }

    public Date getMembegintime() {
        return membegintime;
    }

    public void setMembegintime(Date membegintime) {
        this.membegintime = membegintime;
    }

    public Date getMemendtime() {
        return memendtime;
    }

    public void setMemendtime(Date memendtime) {
        this.memendtime = memendtime;
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