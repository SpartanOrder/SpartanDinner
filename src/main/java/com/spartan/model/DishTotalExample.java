package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DishTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishTotalExample() {
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

        public Criteria andDishtotalIdIsNull() {
            addCriterion("m.dishtotal_Id is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdIsNotNull() {
            addCriterion("m.dishtotal_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdEqualTo(Integer value) {
            addCriterion("m.dishtotal_Id =", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_Id <>", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdGreaterThan(Integer value) {
            addCriterion("m.dishtotal_Id >", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Id >=", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdLessThan(Integer value) {
            addCriterion("m.dishtotal_Id <", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Id <=", value, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdIn(List<Integer> values) {
            addCriterion("m.dishtotal_Id in", values, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_Id not in", values, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Id between", value1, value2, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Id not between", value1, value2, "dishtotalId");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidIsNull() {
            addCriterion("m.dishtotal_dishId is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidIsNotNull() {
            addCriterion("m.dishtotal_dishId is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidEqualTo(Integer value) {
            addCriterion("m.dishtotal_dishId =", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_dishId <>", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidGreaterThan(Integer value) {
            addCriterion("m.dishtotal_dishId >", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_dishId >=", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidLessThan(Integer value) {
            addCriterion("m.dishtotal_dishId <", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_dishId <=", value, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidIn(List<Integer> values) {
            addCriterion("m.dishtotal_dishId in", values, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_dishId not in", values, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_dishId between", value1, value2, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalDishidNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_dishId not between", value1, value2, "dishtotalDishid");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearIsNull() {
            addCriterion("m.dishtotal_Year is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearIsNotNull() {
            addCriterion("m.dishtotal_Year is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearEqualTo(Integer value) {
            addCriterion("m.dishtotal_Year =", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_Year <>", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearGreaterThan(Integer value) {
            addCriterion("m.dishtotal_Year >", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Year >=", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearLessThan(Integer value) {
            addCriterion("m.dishtotal_Year <", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Year <=", value, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearIn(List<Integer> values) {
            addCriterion("m.dishtotal_Year in", values, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_Year not in", values, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Year between", value1, value2, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalYearNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Year not between", value1, value2, "dishtotalYear");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthIsNull() {
            addCriterion("m.dishtotal_Month is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthIsNotNull() {
            addCriterion("m.dishtotal_Month is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthEqualTo(Integer value) {
            addCriterion("m.dishtotal_Month =", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_Month <>", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthGreaterThan(Integer value) {
            addCriterion("m.dishtotal_Month >", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Month >=", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthLessThan(Integer value) {
            addCriterion("m.dishtotal_Month <", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Month <=", value, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthIn(List<Integer> values) {
            addCriterion("m.dishtotal_Month in", values, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_Month not in", values, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Month between", value1, value2, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Month not between", value1, value2, "dishtotalMonth");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayIsNull() {
            addCriterion("m.dishtotal_Day is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayIsNotNull() {
            addCriterion("m.dishtotal_Day is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayEqualTo(Integer value) {
            addCriterion("m.dishtotal_Day =", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_Day <>", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayGreaterThan(Integer value) {
            addCriterion("m.dishtotal_Day >", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Day >=", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayLessThan(Integer value) {
            addCriterion("m.dishtotal_Day <", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_Day <=", value, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayIn(List<Integer> values) {
            addCriterion("m.dishtotal_Day in", values, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_Day not in", values, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Day between", value1, value2, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDayNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_Day not between", value1, value2, "dishtotalDay");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeIsNull() {
            addCriterion("m.dishtotal_DayTime is null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeIsNotNull() {
            addCriterion("m.dishtotal_DayTime is not null");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeEqualTo(Integer value) {
            addCriterion("m.dishtotal_DayTime =", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeNotEqualTo(Integer value) {
            addCriterion("m.dishtotal_DayTime <>", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeGreaterThan(Integer value) {
            addCriterion("m.dishtotal_DayTime >", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_DayTime >=", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeLessThan(Integer value) {
            addCriterion("m.dishtotal_DayTime <", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("m.dishtotal_DayTime <=", value, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeIn(List<Integer> values) {
            addCriterion("m.dishtotal_DayTime in", values, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeNotIn(List<Integer> values) {
            addCriterion("m.dishtotal_DayTime not in", values, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_DayTime between", value1, value2, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andDishtotalDaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dishtotal_DayTime not between", value1, value2, "dishtotalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("m.total_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("m.total_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("m.total_Amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.total_Amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("m.total_Amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_Amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("m.total_Amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_Amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("m.total_Amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.total_Amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_Amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_Amount not between", value1, value2, "totalAmount");
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