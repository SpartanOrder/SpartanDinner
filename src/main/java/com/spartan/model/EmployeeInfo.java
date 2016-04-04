package com.spartan.model;

import java.util.Date;

public class EmployeeInfo {
    private Integer employeeId;

    private User account;

    private String employeeName;

    private Byte employeeSex;

    private Date birthDate;

    private String idCard;

    private String tel;

    private String fixedPhone;

    private String degree;

    private String description;

    private String address;

    private Department department;

    private Integer salary;

    private Date employeeDate;

    private Date fireDate;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public EmployeeInfo() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        if (account.getUserId() == null) {
            this.account = null;
        } else {
            this.account = account;
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Byte getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(Byte employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone == null ? null : fixedPhone.trim();
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (department.getDepartmentId() == null) {
            this.department = null;
        } else {
            this.department = department;
        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(Date employeeDate) {
        this.employeeDate = employeeDate;
    }

    public Date getFireDate() {
        return fireDate;
    }

    public void setFireDate(Date fireDate) {
        this.fireDate = fireDate;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getLastSubtime() {
        return lastSubtime;
    }

    public void setLastSubtime(Date lastSubtime) {
        this.lastSubtime = lastSubtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if (user.getUserId() == null) {
            this.user = null;
        } else {
            this.user = user;
        }

    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId=" + employeeId +
                ", account=" + account +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex=" + employeeSex +
                ", birthDate=" + birthDate +
                ", idCard='" + idCard + '\'' +
                ", tel='" + tel + '\'' +
                ", fixedPhone='" + fixedPhone + '\'' +
                ", degree='" + degree + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", employeeDate=" + employeeDate +
                ", fireDate=" + fireDate +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}