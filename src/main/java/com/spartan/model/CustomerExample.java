package com.spartan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("m.customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("m.customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("m.customer_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("m.customer_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("m.customer_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.customer_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("m.customer_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.customer_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("m.customer_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("m.customer_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("m.customer_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.customer_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("m.customer_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("m.customer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("m.customer_Name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("m.customer_Name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("m.customer_Name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("m.customer_Name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("m.customer_Name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("m.customer_Name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("m.customer_Name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("m.customer_Name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("m.customer_Name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("m.customer_Name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("m.customer_Name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("m.customer_Name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("m.customer_Tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("m.customer_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("m.customer_Tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("m.customer_Tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("m.customer_Tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("m.customer_Tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("m.customer_Tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("m.customer_Tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("m.customer_Tel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("m.customer_Tel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("m.customer_Tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("m.customer_Tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("m.customer_Tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("m.customer_Tel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNull() {
            addCriterion("m.customer_Gender is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIsNotNull() {
            addCriterion("m.customer_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderEqualTo(Byte value) {
            addCriterion("m.customer_Gender =", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotEqualTo(Byte value) {
            addCriterion("m.customer_Gender <>", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThan(Byte value) {
            addCriterion("m.customer_Gender >", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("m.customer_Gender >=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThan(Byte value) {
            addCriterion("m.customer_Gender <", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderLessThanOrEqualTo(Byte value) {
            addCriterion("m.customer_Gender <=", value, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderIn(List<Byte> values) {
            addCriterion("m.customer_Gender in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotIn(List<Byte> values) {
            addCriterion("m.customer_Gender not in", values, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderBetween(Byte value1, Byte value2) {
            addCriterion("m.customer_Gender between", value1, value2, "customerGender");
            return (Criteria) this;
        }

        public Criteria andCustomerGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("m.customer_Gender not between", value1, value2, "customerGender");
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