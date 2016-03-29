package com.spartan.model;

import java.util.Date;

public class EmployeeInfo {
    private Integer employeeid;

    private Integer userid;

    private String employeename;

    private Byte employeesex;

    private Date birthdate;

    private String idcard;

    private String tel;

    private String fixedphone;

    private String degree;

    private String description;

    private String address;

    private Integer departmentid;

    private Integer salary;

    private Date employeedate;

    private Date firedate;

    private Byte delflag;

    private Date lastsubtime;

    private Integer subby;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public Byte getEmployeesex() {
        return employeesex;
    }

    public void setEmployeesex(Byte employeesex) {
        this.employeesex = employeesex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFixedphone() {
        return fixedphone;
    }

    public void setFixedphone(String fixedphone) {
        this.fixedphone = fixedphone == null ? null : fixedphone.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getEmployeedate() {
        return employeedate;
    }

    public void setEmployeedate(Date employeedate) {
        this.employeedate = employeedate;
    }

    public Date getFiredate() {
        return firedate;
    }

    public void setFiredate(Date firedate) {
        this.firedate = firedate;
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