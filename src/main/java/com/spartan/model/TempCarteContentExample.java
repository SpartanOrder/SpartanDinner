package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempCarteContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempCarteContentExample() {
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

        public Criteria andTccIdIsNull() {
            addCriterion("m.TCC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTccIdIsNotNull() {
            addCriterion("m.TCC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTccIdEqualTo(Integer value) {
            addCriterion("m.TCC_ID =", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdNotEqualTo(Integer value) {
            addCriterion("m.TCC_ID <>", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdGreaterThan(Integer value) {
            addCriterion("m.TCC_ID >", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_ID >=", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdLessThan(Integer value) {
            addCriterion("m.TCC_ID <", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_ID <=", value, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdIn(List<Integer> values) {
            addCriterion("m.TCC_ID in", values, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdNotIn(List<Integer> values) {
            addCriterion("m.TCC_ID not in", values, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_ID between", value1, value2, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_ID not between", value1, value2, "tccId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdIsNull() {
            addCriterion("m.TCC_TCI_ID is null");
            return (Criteria) this;
        }

        public Criteria andTccTciIdIsNotNull() {
            addCriterion("m.TCC_TCI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTccTciIdEqualTo(Integer value) {
            addCriterion("m.TCC_TCI_ID =", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdNotEqualTo(Integer value) {
            addCriterion("m.TCC_TCI_ID <>", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdGreaterThan(Integer value) {
            addCriterion("m.TCC_TCI_ID >", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_TCI_ID >=", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdLessThan(Integer value) {
            addCriterion("m.TCC_TCI_ID <", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_TCI_ID <=", value, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdIn(List<Integer> values) {
            addCriterion("m.TCC_TCI_ID in", values, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdNotIn(List<Integer> values) {
            addCriterion("m.TCC_TCI_ID not in", values, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_TCI_ID between", value1, value2, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccTciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_TCI_ID not between", value1, value2, "tccTciId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdIsNull() {
            addCriterion("m.TCC_Dish_ID is null");
            return (Criteria) this;
        }

        public Criteria andTccDishIdIsNotNull() {
            addCriterion("m.TCC_Dish_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTccDishIdEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_ID =", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdNotEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_ID <>", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdGreaterThan(Integer value) {
            addCriterion("m.TCC_Dish_ID >", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_ID >=", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdLessThan(Integer value) {
            addCriterion("m.TCC_Dish_ID <", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_ID <=", value, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdIn(List<Integer> values) {
            addCriterion("m.TCC_Dish_ID in", values, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdNotIn(List<Integer> values) {
            addCriterion("m.TCC_Dish_ID not in", values, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_Dish_ID between", value1, value2, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_Dish_ID not between", value1, value2, "tccDishId");
            return (Criteria) this;
        }

        public Criteria andTccDishNumIsNull() {
            addCriterion("m.TCC_Dish_Num is null");
            return (Criteria) this;
        }

        public Criteria andTccDishNumIsNotNull() {
            addCriterion("m.TCC_Dish_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTccDishNumEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_Num =", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumNotEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_Num <>", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumGreaterThan(Integer value) {
            addCriterion("m.TCC_Dish_Num >", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_Num >=", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumLessThan(Integer value) {
            addCriterion("m.TCC_Dish_Num <", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCC_Dish_Num <=", value, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumIn(List<Integer> values) {
            addCriterion("m.TCC_Dish_Num in", values, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumNotIn(List<Integer> values) {
            addCriterion("m.TCC_Dish_Num not in", values, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_Dish_Num between", value1, value2, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccDishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCC_Dish_Num not between", value1, value2, "tccDishNum");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceIsNull() {
            addCriterion("m.TCC_Total_Price is null");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceIsNotNull() {
            addCriterion("m.TCC_Total_Price is not null");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceEqualTo(BigDecimal value) {
            addCriterion("m.TCC_Total_Price =", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("m.TCC_Total_Price <>", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("m.TCC_Total_Price >", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCC_Total_Price >=", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceLessThan(BigDecimal value) {
            addCriterion("m.TCC_Total_Price <", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCC_Total_Price <=", value, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceIn(List<BigDecimal> values) {
            addCriterion("m.TCC_Total_Price in", values, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("m.TCC_Total_Price not in", values, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCC_Total_Price between", value1, value2, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCC_Total_Price not between", value1, value2, "tccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescIsNull() {
            addCriterion("m.TCC_Specil_Desc is null");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescIsNotNull() {
            addCriterion("m.TCC_Specil_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescEqualTo(String value) {
            addCriterion("m.TCC_Specil_Desc =", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescNotEqualTo(String value) {
            addCriterion("m.TCC_Specil_Desc <>", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescGreaterThan(String value) {
            addCriterion("m.TCC_Specil_Desc >", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescGreaterThanOrEqualTo(String value) {
            addCriterion("m.TCC_Specil_Desc >=", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescLessThan(String value) {
            addCriterion("m.TCC_Specil_Desc <", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescLessThanOrEqualTo(String value) {
            addCriterion("m.TCC_Specil_Desc <=", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescLike(String value) {
            addCriterion("m.TCC_Specil_Desc like", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescNotLike(String value) {
            addCriterion("m.TCC_Specil_Desc not like", value, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescIn(List<String> values) {
            addCriterion("m.TCC_Specil_Desc in", values, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescNotIn(List<String> values) {
            addCriterion("m.TCC_Specil_Desc not in", values, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescBetween(String value1, String value2) {
            addCriterion("m.TCC_Specil_Desc between", value1, value2, "tccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andTccSpecilDescNotBetween(String value1, String value2) {
            addCriterion("m.TCC_Specil_Desc not between", value1, value2, "tccSpecilDesc");
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