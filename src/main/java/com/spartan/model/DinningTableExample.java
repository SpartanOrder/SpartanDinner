package com.spartan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DinningTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DinningTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_ID is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_ID =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_ID <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_ID >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_ID >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_ID <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_ID <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_ID in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_ID not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_ID between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_ID not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_ID =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_ID <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_ID >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_ID >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_ID <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_ID <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_ID in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_ID not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_ID between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_ID not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_Name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_Name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_Name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_Name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_Name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_Name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_Name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_Name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_Name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_Name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_Name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_Name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_Name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableStateIsNull() {
            addCriterion("table_State is null");
            return (Criteria) this;
        }

        public Criteria andTableStateIsNotNull() {
            addCriterion("table_State is not null");
            return (Criteria) this;
        }

        public Criteria andTableStateEqualTo(Byte value) {
            addCriterion("table_State =", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotEqualTo(Byte value) {
            addCriterion("table_State <>", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateGreaterThan(Byte value) {
            addCriterion("table_State >", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("table_State >=", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateLessThan(Byte value) {
            addCriterion("table_State <", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateLessThanOrEqualTo(Byte value) {
            addCriterion("table_State <=", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateIn(List<Byte> values) {
            addCriterion("table_State in", values, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotIn(List<Byte> values) {
            addCriterion("table_State not in", values, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateBetween(Byte value1, Byte value2) {
            addCriterion("table_State between", value1, value2, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotBetween(Byte value1, Byte value2) {
            addCriterion("table_State not between", value1, value2, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableDescIsNull() {
            addCriterion("table_Desc is null");
            return (Criteria) this;
        }

        public Criteria andTableDescIsNotNull() {
            addCriterion("table_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andTableDescEqualTo(String value) {
            addCriterion("table_Desc =", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotEqualTo(String value) {
            addCriterion("table_Desc <>", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescGreaterThan(String value) {
            addCriterion("table_Desc >", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescGreaterThanOrEqualTo(String value) {
            addCriterion("table_Desc >=", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLessThan(String value) {
            addCriterion("table_Desc <", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLessThanOrEqualTo(String value) {
            addCriterion("table_Desc <=", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLike(String value) {
            addCriterion("table_Desc like", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotLike(String value) {
            addCriterion("table_Desc not like", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescIn(List<String> values) {
            addCriterion("table_Desc in", values, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotIn(List<String> values) {
            addCriterion("table_Desc not in", values, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescBetween(String value1, String value2) {
            addCriterion("table_Desc between", value1, value2, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotBetween(String value1, String value2) {
            addCriterion("table_Desc not between", value1, value2, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerIsNull() {
            addCriterion("max_Consumer is null");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerIsNotNull() {
            addCriterion("max_Consumer is not null");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerEqualTo(Integer value) {
            addCriterion("max_Consumer =", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerNotEqualTo(Integer value) {
            addCriterion("max_Consumer <>", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerGreaterThan(Integer value) {
            addCriterion("max_Consumer >", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_Consumer >=", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerLessThan(Integer value) {
            addCriterion("max_Consumer <", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerLessThanOrEqualTo(Integer value) {
            addCriterion("max_Consumer <=", value, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerIn(List<Integer> values) {
            addCriterion("max_Consumer in", values, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerNotIn(List<Integer> values) {
            addCriterion("max_Consumer not in", values, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerBetween(Integer value1, Integer value2) {
            addCriterion("max_Consumer between", value1, value2, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andMaxConsumerNotBetween(Integer value1, Integer value2) {
            addCriterion("max_Consumer not between", value1, value2, "maxConsumer");
            return (Criteria) this;
        }

        public Criteria andTableRemarkIsNull() {
            addCriterion("table_Remark is null");
            return (Criteria) this;
        }

        public Criteria andTableRemarkIsNotNull() {
            addCriterion("table_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andTableRemarkEqualTo(String value) {
            addCriterion("table_Remark =", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkNotEqualTo(String value) {
            addCriterion("table_Remark <>", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkGreaterThan(String value) {
            addCriterion("table_Remark >", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("table_Remark >=", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkLessThan(String value) {
            addCriterion("table_Remark <", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkLessThanOrEqualTo(String value) {
            addCriterion("table_Remark <=", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkLike(String value) {
            addCriterion("table_Remark like", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkNotLike(String value) {
            addCriterion("table_Remark not like", value, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkIn(List<String> values) {
            addCriterion("table_Remark in", values, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkNotIn(List<String> values) {
            addCriterion("table_Remark not in", values, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkBetween(String value1, String value2) {
            addCriterion("table_Remark between", value1, value2, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andTableRemarkNotBetween(String value1, String value2) {
            addCriterion("table_Remark not between", value1, value2, "tableRemark");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_Flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_Flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_Flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_Flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_Flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_Flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_Flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_Flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_Flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_Flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_Flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIsNull() {
            addCriterion("last_SubTime is null");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIsNotNull() {
            addCriterion("last_SubTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeEqualTo(Date value) {
            addCriterion("last_SubTime =", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotEqualTo(Date value) {
            addCriterion("last_SubTime <>", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeGreaterThan(Date value) {
            addCriterion("last_SubTime >", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_SubTime >=", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeLessThan(Date value) {
            addCriterion("last_SubTime <", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeLessThanOrEqualTo(Date value) {
            addCriterion("last_SubTime <=", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIn(List<Date> values) {
            addCriterion("last_SubTime in", values, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotIn(List<Date> values) {
            addCriterion("last_SubTime not in", values, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeBetween(Date value1, Date value2) {
            addCriterion("last_SubTime between", value1, value2, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotBetween(Date value1, Date value2) {
            addCriterion("last_SubTime not between", value1, value2, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andSubbyIsNull() {
            addCriterion("subBy is null");
            return (Criteria) this;
        }

        public Criteria andSubbyIsNotNull() {
            addCriterion("subBy is not null");
            return (Criteria) this;
        }

        public Criteria andSubbyEqualTo(Integer value) {
            addCriterion("subBy =", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotEqualTo(Integer value) {
            addCriterion("subBy <>", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyGreaterThan(Integer value) {
            addCriterion("subBy >", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("subBy >=", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyLessThan(Integer value) {
            addCriterion("subBy <", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyLessThanOrEqualTo(Integer value) {
            addCriterion("subBy <=", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyIn(List<Integer> values) {
            addCriterion("subBy in", values, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotIn(List<Integer> values) {
            addCriterion("subBy not in", values, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyBetween(Integer value1, Integer value2) {
            addCriterion("subBy between", value1, value2, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotBetween(Integer value1, Integer value2) {
            addCriterion("subBy not between", value1, value2, "subby");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}