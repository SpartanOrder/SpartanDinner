package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnAccountCarteContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnAccountCarteContentExample() {
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

        public Criteria andOccIdIsNull() {
            addCriterion("OCC_ID is null");
            return (Criteria) this;
        }

        public Criteria andOccIdIsNotNull() {
            addCriterion("OCC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOccIdEqualTo(Integer value) {
            addCriterion("OCC_ID =", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdNotEqualTo(Integer value) {
            addCriterion("OCC_ID <>", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdGreaterThan(Integer value) {
            addCriterion("OCC_ID >", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCC_ID >=", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdLessThan(Integer value) {
            addCriterion("OCC_ID <", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdLessThanOrEqualTo(Integer value) {
            addCriterion("OCC_ID <=", value, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdIn(List<Integer> values) {
            addCriterion("OCC_ID in", values, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdNotIn(List<Integer> values) {
            addCriterion("OCC_ID not in", values, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdBetween(Integer value1, Integer value2) {
            addCriterion("OCC_ID between", value1, value2, "occId");
            return (Criteria) this;
        }

        public Criteria andOccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OCC_ID not between", value1, value2, "occId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdIsNull() {
            addCriterion("OCC_OCI_ID is null");
            return (Criteria) this;
        }

        public Criteria andOccOciIdIsNotNull() {
            addCriterion("OCC_OCI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOccOciIdEqualTo(Integer value) {
            addCriterion("OCC_OCI_ID =", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdNotEqualTo(Integer value) {
            addCriterion("OCC_OCI_ID <>", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdGreaterThan(Integer value) {
            addCriterion("OCC_OCI_ID >", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCC_OCI_ID >=", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdLessThan(Integer value) {
            addCriterion("OCC_OCI_ID <", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdLessThanOrEqualTo(Integer value) {
            addCriterion("OCC_OCI_ID <=", value, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdIn(List<Integer> values) {
            addCriterion("OCC_OCI_ID in", values, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdNotIn(List<Integer> values) {
            addCriterion("OCC_OCI_ID not in", values, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdBetween(Integer value1, Integer value2) {
            addCriterion("OCC_OCI_ID between", value1, value2, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccOciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OCC_OCI_ID not between", value1, value2, "occOciId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdIsNull() {
            addCriterion("OCC_Dish_ID is null");
            return (Criteria) this;
        }

        public Criteria andOccDishIdIsNotNull() {
            addCriterion("OCC_Dish_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOccDishIdEqualTo(Integer value) {
            addCriterion("OCC_Dish_ID =", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdNotEqualTo(Integer value) {
            addCriterion("OCC_Dish_ID <>", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdGreaterThan(Integer value) {
            addCriterion("OCC_Dish_ID >", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCC_Dish_ID >=", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdLessThan(Integer value) {
            addCriterion("OCC_Dish_ID <", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("OCC_Dish_ID <=", value, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdIn(List<Integer> values) {
            addCriterion("OCC_Dish_ID in", values, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdNotIn(List<Integer> values) {
            addCriterion("OCC_Dish_ID not in", values, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdBetween(Integer value1, Integer value2) {
            addCriterion("OCC_Dish_ID between", value1, value2, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OCC_Dish_ID not between", value1, value2, "occDishId");
            return (Criteria) this;
        }

        public Criteria andOccDishNumIsNull() {
            addCriterion("OCC_Dish_Num is null");
            return (Criteria) this;
        }

        public Criteria andOccDishNumIsNotNull() {
            addCriterion("OCC_Dish_Num is not null");
            return (Criteria) this;
        }

        public Criteria andOccDishNumEqualTo(Integer value) {
            addCriterion("OCC_Dish_Num =", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumNotEqualTo(Integer value) {
            addCriterion("OCC_Dish_Num <>", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumGreaterThan(Integer value) {
            addCriterion("OCC_Dish_Num >", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCC_Dish_Num >=", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumLessThan(Integer value) {
            addCriterion("OCC_Dish_Num <", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumLessThanOrEqualTo(Integer value) {
            addCriterion("OCC_Dish_Num <=", value, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumIn(List<Integer> values) {
            addCriterion("OCC_Dish_Num in", values, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumNotIn(List<Integer> values) {
            addCriterion("OCC_Dish_Num not in", values, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumBetween(Integer value1, Integer value2) {
            addCriterion("OCC_Dish_Num between", value1, value2, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccDishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("OCC_Dish_Num not between", value1, value2, "occDishNum");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceIsNull() {
            addCriterion("OCC_Total_Price is null");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceIsNotNull() {
            addCriterion("OCC_Total_Price is not null");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceEqualTo(BigDecimal value) {
            addCriterion("OCC_Total_Price =", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("OCC_Total_Price <>", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("OCC_Total_Price >", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OCC_Total_Price >=", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceLessThan(BigDecimal value) {
            addCriterion("OCC_Total_Price <", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OCC_Total_Price <=", value, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceIn(List<BigDecimal> values) {
            addCriterion("OCC_Total_Price in", values, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("OCC_Total_Price not in", values, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCC_Total_Price between", value1, value2, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCC_Total_Price not between", value1, value2, "occTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescIsNull() {
            addCriterion("OCC_Specil_Desc is null");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescIsNotNull() {
            addCriterion("OCC_Specil_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescEqualTo(String value) {
            addCriterion("OCC_Specil_Desc =", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescNotEqualTo(String value) {
            addCriterion("OCC_Specil_Desc <>", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescGreaterThan(String value) {
            addCriterion("OCC_Specil_Desc >", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescGreaterThanOrEqualTo(String value) {
            addCriterion("OCC_Specil_Desc >=", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescLessThan(String value) {
            addCriterion("OCC_Specil_Desc <", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescLessThanOrEqualTo(String value) {
            addCriterion("OCC_Specil_Desc <=", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescLike(String value) {
            addCriterion("OCC_Specil_Desc like", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescNotLike(String value) {
            addCriterion("OCC_Specil_Desc not like", value, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescIn(List<String> values) {
            addCriterion("OCC_Specil_Desc in", values, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescNotIn(List<String> values) {
            addCriterion("OCC_Specil_Desc not in", values, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescBetween(String value1, String value2) {
            addCriterion("OCC_Specil_Desc between", value1, value2, "occSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andOccSpecilDescNotBetween(String value1, String value2) {
            addCriterion("OCC_Specil_Desc not between", value1, value2, "occSpecilDesc");
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