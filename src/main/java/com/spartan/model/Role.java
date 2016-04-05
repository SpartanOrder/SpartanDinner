package com.spartan.model;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleName;

    private Department department;

    private String description;

    private String powerIds;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPowerIds() {
        return powerIds;
    }

    public void setPowerIds(String powerIds) {
        this.powerIds = powerIds == null ? null : powerIds.trim();
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
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", department=" + department +
                ", description='" + description + '\'' +
                ", powerIds='" + powerIds + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}