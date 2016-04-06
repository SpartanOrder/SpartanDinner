package com.spartan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DishTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishTypeExample() {
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

        public Criteria andDishTypeIdIsNull() {
            addCriterion("m.dish_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdIsNotNull() {
            addCriterion("m.dish_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdEqualTo(Integer value) {
            addCriterion("m.dish_Type_ID =", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotEqualTo(Integer value) {
            addCriterion("m.dish_Type_ID <>", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdGreaterThan(Integer value) {
            addCriterion("m.dish_Type_ID >", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dish_Type_ID >=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdLessThan(Integer value) {
            addCriterion("m.dish_Type_ID <", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.dish_Type_ID <=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdIn(List<Integer> values) {
            addCriterion("m.dish_Type_ID in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotIn(List<Integer> values) {
            addCriterion("m.dish_Type_ID not in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_Type_ID between", value1, value2, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_Type_ID not between", value1, value2, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameIsNull() {
            addCriterion("m.dish_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameIsNotNull() {
            addCriterion("m.dish_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameEqualTo(String value) {
            addCriterion("m.dish_Type_Name =", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameNotEqualTo(String value) {
            addCriterion("m.dish_Type_Name <>", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameGreaterThan(String value) {
            addCriterion("m.dish_Type_Name >", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Type_Name >=", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameLessThan(String value) {
            addCriterion("m.dish_Type_Name <", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Type_Name <=", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameLike(String value) {
            addCriterion("m.dish_Type_Name like", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameNotLike(String value) {
            addCriterion("m.dish_Type_Name not like", value, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameIn(List<String> values) {
            addCriterion("m.dish_Type_Name in", values, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameNotIn(List<String> values) {
            addCriterion("m.dish_Type_Name not in", values, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameBetween(String value1, String value2) {
            addCriterion("m.dish_Type_Name between", value1, value2, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeNameNotBetween(String value1, String value2) {
            addCriterion("m.dish_Type_Name not between", value1, value2, "dishTypeName");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescIsNull() {
            addCriterion("m.dish_Type_Desc is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescIsNotNull() {
            addCriterion("m.dish_Type_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescEqualTo(String value) {
            addCriterion("m.dish_Type_Desc =", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescNotEqualTo(String value) {
            addCriterion("m.dish_Type_Desc <>", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescGreaterThan(String value) {
            addCriterion("m.dish_Type_Desc >", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Type_Desc >=", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescLessThan(String value) {
            addCriterion("m.dish_Type_Desc <", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Type_Desc <=", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescLike(String value) {
            addCriterion("m.dish_Type_Desc like", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescNotLike(String value) {
            addCriterion("m.dish_Type_Desc not like", value, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescIn(List<String> values) {
            addCriterion("m.dish_Type_Desc in", values, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescNotIn(List<String> values) {
            addCriterion("m.dish_Type_Desc not in", values, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescBetween(String value1, String value2) {
            addCriterion("m.dish_Type_Desc between", value1, value2, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeDescNotBetween(String value1, String value2) {
            addCriterion("m.dish_Type_Desc not between", value1, value2, "dishTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusIsNull() {
            addCriterion("m.dish_Type_Status is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusIsNotNull() {
            addCriterion("m.dish_Type_Status is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusEqualTo(Byte value) {
            addCriterion("m.dish_Type_Status =", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusNotEqualTo(Byte value) {
            addCriterion("m.dish_Type_Status <>", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusGreaterThan(Byte value) {
            addCriterion("m.dish_Type_Status >", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("m.dish_Type_Status >=", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusLessThan(Byte value) {
            addCriterion("m.dish_Type_Status <", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("m.dish_Type_Status <=", value, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusIn(List<Byte> values) {
            addCriterion("m.dish_Type_Status in", values, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusNotIn(List<Byte> values) {
            addCriterion("m.dish_Type_Status not in", values, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusBetween(Byte value1, Byte value2) {
            addCriterion("m.dish_Type_Status between", value1, value2, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("m.dish_Type_Status not between", value1, value2, "dishTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidIsNull() {
            addCriterion("m.dish_Type_orderId is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidIsNotNull() {
            addCriterion("m.dish_Type_orderId is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidEqualTo(Integer value) {
            addCriterion("m.dish_Type_orderId =", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidNotEqualTo(Integer value) {
            addCriterion("m.dish_Type_orderId <>", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidGreaterThan(Integer value) {
            addCriterion("m.dish_Type_orderId >", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dish_Type_orderId >=", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidLessThan(Integer value) {
            addCriterion("m.dish_Type_orderId <", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("m.dish_Type_orderId <=", value, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidIn(List<Integer> values) {
            addCriterion("m.dish_Type_orderId in", values, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidNotIn(List<Integer> values) {
            addCriterion("m.dish_Type_orderId not in", values, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_Type_orderId between", value1, value2, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDishTypeOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_Type_orderId not between", value1, value2, "dishTypeOrderid");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("m.del_Flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("m.del_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("m.del_Flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("m.del_Flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("m.del_Flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("m.del_Flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("m.del_Flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("m.del_Flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("m.del_Flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("m.del_Flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("m.del_Flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("m.del_Flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIsNull() {
            addCriterion("m.last_SubTime is null");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIsNotNull() {
            addCriterion("m.last_SubTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeEqualTo(Date value) {
            addCriterion("m.last_SubTime =", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotEqualTo(Date value) {
            addCriterion("m.last_SubTime <>", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeGreaterThan(Date value) {
            addCriterion("m.last_SubTime >", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m.last_SubTime >=", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeLessThan(Date value) {
            addCriterion("m.last_SubTime <", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeLessThanOrEqualTo(Date value) {
            addCriterion("m.last_SubTime <=", value, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeIn(List<Date> values) {
            addCriterion("m.last_SubTime in", values, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotIn(List<Date> values) {
            addCriterion("m.last_SubTime not in", values, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeBetween(Date value1, Date value2) {
            addCriterion("m.last_SubTime between", value1, value2, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andLastSubtimeNotBetween(Date value1, Date value2) {
            addCriterion("m.last_SubTime not between", value1, value2, "lastSubtime");
            return (Criteria) this;
        }

        public Criteria andSubbyIsNull() {
            addCriterion("m.subBy is null");
            return (Criteria) this;
        }

        public Criteria andSubbyIsNotNull() {
            addCriterion("m.subBy is not null");
            return (Criteria) this;
        }

        public Criteria andSubbyEqualTo(Integer value) {
            addCriterion("m.subBy =", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotEqualTo(Integer value) {
            addCriterion("m.subBy <>", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyGreaterThan(Integer value) {
            addCriterion("m.subBy >", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.subBy >=", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyLessThan(Integer value) {
            addCriterion("m.subBy <", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyLessThanOrEqualTo(Integer value) {
            addCriterion("m.subBy <=", value, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyIn(List<Integer> values) {
            addCriterion("m.subBy in", values, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotIn(List<Integer> values) {
            addCriterion("m.subBy not in", values, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyBetween(Integer value1, Integer value2) {
            addCriterion("m.subBy between", value1, value2, "subby");
            return (Criteria) this;
        }

        public Criteria andSubbyNotBetween(Integer value1, Integer value2) {
            addCriterion("m.subBy not between", value1, value2, "subby");
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