package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberTypeExample() {
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

        public Criteria andMemTypeIdIsNull() {
            addCriterion("m.mem_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdIsNotNull() {
            addCriterion("m.mem_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdEqualTo(Integer value) {
            addCriterion("m.mem_Type_ID =", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotEqualTo(Integer value) {
            addCriterion("m.mem_Type_ID <>", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdGreaterThan(Integer value) {
            addCriterion("m.mem_Type_ID >", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.mem_Type_ID >=", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdLessThan(Integer value) {
            addCriterion("m.mem_Type_ID <", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.mem_Type_ID <=", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdIn(List<Integer> values) {
            addCriterion("m.mem_Type_ID in", values, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotIn(List<Integer> values) {
            addCriterion("m.mem_Type_ID not in", values, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("m.mem_Type_ID between", value1, value2, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.mem_Type_ID not between", value1, value2, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameIsNull() {
            addCriterion("m.mem_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameIsNotNull() {
            addCriterion("m.mem_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameEqualTo(String value) {
            addCriterion("m.mem_Type_Name =", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameNotEqualTo(String value) {
            addCriterion("m.mem_Type_Name <>", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameGreaterThan(String value) {
            addCriterion("m.mem_Type_Name >", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("m.mem_Type_Name >=", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameLessThan(String value) {
            addCriterion("m.mem_Type_Name <", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameLessThanOrEqualTo(String value) {
            addCriterion("m.mem_Type_Name <=", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameLike(String value) {
            addCriterion("m.mem_Type_Name like", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameNotLike(String value) {
            addCriterion("m.mem_Type_Name not like", value, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameIn(List<String> values) {
            addCriterion("m.mem_Type_Name in", values, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameNotIn(List<String> values) {
            addCriterion("m.mem_Type_Name not in", values, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameBetween(String value1, String value2) {
            addCriterion("m.mem_Type_Name between", value1, value2, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeNameNotBetween(String value1, String value2) {
            addCriterion("m.mem_Type_Name not between", value1, value2, "memTypeName");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountIsNull() {
            addCriterion("m.mem_Type_Discount is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountIsNotNull() {
            addCriterion("m.mem_Type_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountEqualTo(BigDecimal value) {
            addCriterion("m.mem_Type_Discount =", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountNotEqualTo(BigDecimal value) {
            addCriterion("m.mem_Type_Discount <>", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountGreaterThan(BigDecimal value) {
            addCriterion("m.mem_Type_Discount >", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.mem_Type_Discount >=", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountLessThan(BigDecimal value) {
            addCriterion("m.mem_Type_Discount <", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.mem_Type_Discount <=", value, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountIn(List<BigDecimal> values) {
            addCriterion("m.mem_Type_Discount in", values, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountNotIn(List<BigDecimal> values) {
            addCriterion("m.mem_Type_Discount not in", values, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.mem_Type_Discount between", value1, value2, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.mem_Type_Discount not between", value1, value2, "memTypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescIsNull() {
            addCriterion("m.mem_Type_Desc is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescIsNotNull() {
            addCriterion("m.mem_Type_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescEqualTo(String value) {
            addCriterion("m.mem_Type_Desc =", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescNotEqualTo(String value) {
            addCriterion("m.mem_Type_Desc <>", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescGreaterThan(String value) {
            addCriterion("m.mem_Type_Desc >", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("m.mem_Type_Desc >=", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescLessThan(String value) {
            addCriterion("m.mem_Type_Desc <", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescLessThanOrEqualTo(String value) {
            addCriterion("m.mem_Type_Desc <=", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescLike(String value) {
            addCriterion("m.mem_Type_Desc like", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescNotLike(String value) {
            addCriterion("m.mem_Type_Desc not like", value, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescIn(List<String> values) {
            addCriterion("m.mem_Type_Desc in", values, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescNotIn(List<String> values) {
            addCriterion("m.mem_Type_Desc not in", values, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescBetween(String value1, String value2) {
            addCriterion("m.mem_Type_Desc between", value1, value2, "memTypeDesc");
            return (Criteria) this;
        }

        public Criteria andMemTypeDescNotBetween(String value1, String value2) {
            addCriterion("m.mem_Type_Desc not between", value1, value2, "memTypeDesc");
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