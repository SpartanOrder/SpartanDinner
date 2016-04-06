package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EndCarteContentExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EndCarteContentExample() {
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

        public Criteria andEccIdIsNull() {
            addCriterion("m.ECC_ID is null");
            return (Criteria) this;
        }

        public Criteria andEccIdIsNotNull() {
            addCriterion("m.ECC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEccIdEqualTo(Integer value) {
            addCriterion("m.ECC_ID =", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdNotEqualTo(Integer value) {
            addCriterion("m.ECC_ID <>", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdGreaterThan(Integer value) {
            addCriterion("m.ECC_ID >", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_ID >=", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdLessThan(Integer value) {
            addCriterion("m.ECC_ID <", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_ID <=", value, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdIn(List<Integer> values) {
            addCriterion("m.ECC_ID in", values, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdNotIn(List<Integer> values) {
            addCriterion("m.ECC_ID not in", values, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_ID between", value1, value2, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_ID not between", value1, value2, "eccId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdIsNull() {
            addCriterion("m.ECC_ECI_ID is null");
            return (Criteria) this;
        }

        public Criteria andEccEciIdIsNotNull() {
            addCriterion("m.ECC_ECI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEccEciIdEqualTo(Integer value) {
            addCriterion("m.ECC_ECI_ID =", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdNotEqualTo(Integer value) {
            addCriterion("m.ECC_ECI_ID <>", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdGreaterThan(Integer value) {
            addCriterion("m.ECC_ECI_ID >", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_ECI_ID >=", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdLessThan(Integer value) {
            addCriterion("m.ECC_ECI_ID <", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_ECI_ID <=", value, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdIn(List<Integer> values) {
            addCriterion("m.ECC_ECI_ID in", values, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdNotIn(List<Integer> values) {
            addCriterion("m.ECC_ECI_ID not in", values, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_ECI_ID between", value1, value2, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccEciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_ECI_ID not between", value1, value2, "eccEciId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdIsNull() {
            addCriterion("m.ECC_Dish_ID is null");
            return (Criteria) this;
        }

        public Criteria andEccDishIdIsNotNull() {
            addCriterion("m.ECC_Dish_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEccDishIdEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_ID =", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdNotEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_ID <>", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdGreaterThan(Integer value) {
            addCriterion("m.ECC_Dish_ID >", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_ID >=", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdLessThan(Integer value) {
            addCriterion("m.ECC_Dish_ID <", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_ID <=", value, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdIn(List<Integer> values) {
            addCriterion("m.ECC_Dish_ID in", values, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdNotIn(List<Integer> values) {
            addCriterion("m.ECC_Dish_ID not in", values, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_Dish_ID between", value1, value2, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_Dish_ID not between", value1, value2, "eccDishId");
            return (Criteria) this;
        }

        public Criteria andEccDishNumIsNull() {
            addCriterion("m.ECC_Dish_Num is null");
            return (Criteria) this;
        }

        public Criteria andEccDishNumIsNotNull() {
            addCriterion("m.ECC_Dish_Num is not null");
            return (Criteria) this;
        }

        public Criteria andEccDishNumEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_Num =", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumNotEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_Num <>", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumGreaterThan(Integer value) {
            addCriterion("m.ECC_Dish_Num >", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_Num >=", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumLessThan(Integer value) {
            addCriterion("m.ECC_Dish_Num <", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumLessThanOrEqualTo(Integer value) {
            addCriterion("m.ECC_Dish_Num <=", value, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumIn(List<Integer> values) {
            addCriterion("m.ECC_Dish_Num in", values, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumNotIn(List<Integer> values) {
            addCriterion("m.ECC_Dish_Num not in", values, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_Dish_Num between", value1, value2, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccDishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("m.ECC_Dish_Num not between", value1, value2, "eccDishNum");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceIsNull() {
            addCriterion("m.ECC_Total_Price is null");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceIsNotNull() {
            addCriterion("m.ECC_Total_Price is not null");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceEqualTo(BigDecimal value) {
            addCriterion("m.ECC_Total_Price =", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("m.ECC_Total_Price <>", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("m.ECC_Total_Price >", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.ECC_Total_Price >=", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceLessThan(BigDecimal value) {
            addCriterion("m.ECC_Total_Price <", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.ECC_Total_Price <=", value, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceIn(List<BigDecimal> values) {
            addCriterion("m.ECC_Total_Price in", values, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("m.ECC_Total_Price not in", values, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.ECC_Total_Price between", value1, value2, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.ECC_Total_Price not between", value1, value2, "eccTotalPrice");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescIsNull() {
            addCriterion("m.ECC_Specil_Desc is null");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescIsNotNull() {
            addCriterion("m.ECC_Specil_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescEqualTo(String value) {
            addCriterion("m.ECC_Specil_Desc =", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescNotEqualTo(String value) {
            addCriterion("m.ECC_Specil_Desc <>", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescGreaterThan(String value) {
            addCriterion("m.ECC_Specil_Desc >", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescGreaterThanOrEqualTo(String value) {
            addCriterion("m.ECC_Specil_Desc >=", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescLessThan(String value) {
            addCriterion("m.ECC_Specil_Desc <", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescLessThanOrEqualTo(String value) {
            addCriterion("m.ECC_Specil_Desc <=", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescLike(String value) {
            addCriterion("m.ECC_Specil_Desc like", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescNotLike(String value) {
            addCriterion("m.ECC_Specil_Desc not like", value, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescIn(List<String> values) {
            addCriterion("m.ECC_Specil_Desc in", values, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescNotIn(List<String> values) {
            addCriterion("m.ECC_Specil_Desc not in", values, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescBetween(String value1, String value2) {
            addCriterion("m.ECC_Specil_Desc between", value1, value2, "eccSpecilDesc");
            return (Criteria) this;
        }

        public Criteria andEccSpecilDescNotBetween(String value1, String value2) {
            addCriterion("m.ECC_Specil_Desc not between", value1, value2, "eccSpecilDesc");
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