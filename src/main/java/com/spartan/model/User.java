package com.spartan.model;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private Role role;

    private Byte userState;

    private String userPassword;

    private String salt;

    private String lastLoginip;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    private EmployeeInfo employeeInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        if (role.getRoleId() == null) {
            this.role = null;
        } else {
            this.role = role;
        }
    }

    public Byte getUserState() {
        return userState;
    }

    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getLastLoginip() {
        return lastLoginip;
    }

    public void setLastLoginip(String lastLoginip) {
        this.lastLoginip = lastLoginip == null ? null : lastLoginip.trim();
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

    public EmployeeInfo getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(EmployeeInfo employeeInfo) {
        if (employeeInfo.getEmployeeId() == null) {
            this.employeeInfo = null;
        } else {
            this.employeeInfo = employeeInfo;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", role=" + role +
                ", userState=" + userState +
                ", userPassword='" + userPassword + '\'' +
                ", salt='" + salt + '\'' +
                ", lastLoginip='" + lastLoginip + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                ", employeeInfo=" + employeeInfo +
                '}';
    }
}