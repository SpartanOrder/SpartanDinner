package com.spartan.model;

import java.util.Date;

public class DinningTable {
    private Integer tableId;

    private Integer regionId;

    private String tableName;

    private Byte tableState;

    private String tableDesc;

    private Integer maxConsumer;

    private String tableRemark;

    private Byte delFlag;

    private Date lastSubtime;

    private Integer subby;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
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

    public Integer getSubby() {
        return subby;
    }

    public void setSubby(Integer subby) {
        this.subby = subby;
    }
}