package com.spartan.model;

import java.util.Date;

public class DinningTable {
    private Integer tableId;

    private Region region;

    private String tableName;

    private Byte tableState;

    private String tableDesc;

    private Integer maxConsumer;

    private String tableRemark;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public DinningTable() {
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        if (region.getRegionId() == null) {
            this.region = null;
        } else {
            this.region = region;
        }
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Byte getTableState() {
        return tableState;
    }

    public void setTableState(Byte tableState) {
        this.tableState = tableState;
    }

    public String getTableDesc() {
        return tableDesc;
    }

    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc == null ? null : tableDesc.trim();
    }

    public Integer getMaxConsumer() {
        return maxConsumer;
    }

    public void setMaxConsumer(Integer maxConsumer) {
        this.maxConsumer = maxConsumer;
    }

    public String getTableRemark() {
        return tableRemark;
    }

    public void setTableRemark(String tableRemark) {
        this.tableRemark = tableRemark == null ? null : tableRemark.trim();
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
        return "DinningTable{" +
                "tableId=" + tableId +
                ", region=" + region +
                ", tableName='" + tableName + '\'' +
                ", tableState=" + tableState +
                ", tableDesc='" + tableDesc + '\'' +
                ", maxConsumer=" + maxConsumer +
                ", tableRemark='" + tableRemark + '\'' +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}