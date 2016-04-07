package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmountTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmountTotalExample() {
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

        public Criteria andTotalIdIsNull() {
            addCriterion("m.total_Id is null");
            return (Criteria) this;
        }

        public Criteria andTotalIdIsNotNull() {
            addCriterion("m.total_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIdEqualTo(Integer value) {
            addCriterion("m.total_Id =", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotEqualTo(Integer value) {
            addCriterion("m.total_Id <>", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThan(Integer value) {
            addCriterion("m.total_Id >", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_Id >=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThan(Integer value) {
            addCriterion("m.total_Id <", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_Id <=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdIn(List<Integer> values) {
            addCriterion("m.total_Id in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotIn(List<Integer> values) {
            addCriterion("m.total_Id not in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Id between", value1, value2, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Id not between", value1, value2, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalYearIsNull() {
            addCriterion("m.total_Year is null");
            return (Criteria) this;
        }

        public Criteria andTotalYearIsNotNull() {
            addCriterion("m.total_Year is not null");
            return (Criteria) this;
        }

        public Criteria andTotalYearEqualTo(Integer value) {
            addCriterion("m.total_Year =", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearNotEqualTo(Integer value) {
            addCriterion("m.total_Year <>", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearGreaterThan(Integer value) {
            addCriterion("m.total_Year >", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_Year >=", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearLessThan(Integer value) {
            addCriterion("m.total_Year <", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_Year <=", value, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearIn(List<Integer> values) {
            addCriterion("m.total_Year in", values, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearNotIn(List<Integer> values) {
            addCriterion("m.total_Year not in", values, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Year between", value1, value2, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalYearNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Year not between", value1, value2, "totalYear");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIsNull() {
            addCriterion("m.total_Month is null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIsNotNull() {
            addCriterion("m.total_Month is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthEqualTo(Integer value) {
            addCriterion("m.total_Month =", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotEqualTo(Integer value) {
            addCriterion("m.total_Month <>", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthGreaterThan(Integer value) {
            addCriterion("m.total_Month >", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_Month >=", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthLessThan(Integer value) {
            addCriterion("m.total_Month <", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_Month <=", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIn(List<Integer> values) {
            addCriterion("m.total_Month in", values, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotIn(List<Integer> values) {
            addCriterion("m.total_Month not in", values, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Month between", value1, value2, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Month not between", value1, value2, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalDayIsNull() {
            addCriterion("m.total_Day is null");
            return (Criteria) this;
        }

        public Criteria andTotalDayIsNotNull() {
            addCriterion("m.total_Day is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDayEqualTo(Integer value) {
            addCriterion("m.total_Day =", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotEqualTo(Integer value) {
            addCriterion("m.total_Day <>", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayGreaterThan(Integer value) {
            addCriterion("m.total_Day >", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_Day >=", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayLessThan(Integer value) {
            addCriterion("m.total_Day <", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_Day <=", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayIn(List<Integer> values) {
            addCriterion("m.total_Day in", values, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotIn(List<Integer> values) {
            addCriterion("m.total_Day not in", values, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Day between", value1, value2, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Day not between", value1, value2, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeIsNull() {
            addCriterion("m.total_DayTime is null");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeIsNotNull() {
            addCriterion("m.total_DayTime is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeEqualTo(Integer value) {
            addCriterion("m.total_DayTime =", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeNotEqualTo(Integer value) {
            addCriterion("m.total_DayTime <>", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeGreaterThan(Integer value) {
            addCriterion("m.total_DayTime >", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_DayTime >=", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeLessThan(Integer value) {
            addCriterion("m.total_DayTime <", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_DayTime <=", value, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeIn(List<Integer> values) {
            addCriterion("m.total_DayTime in", values, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeNotIn(List<Integer> values) {
            addCriterion("m.total_DayTime not in", values, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeBetween(Integer value1, Integer value2) {
            addCriterion("m.total_DayTime between", value1, value2, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalDaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_DayTime not between", value1, value2, "totalDaytime");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("m.total_Num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("m.total_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("m.total_Num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("m.total_Num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("m.total_Num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total_Num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("m.total_Num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("m.total_Num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("m.total_Num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("m.total_Num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total_Num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumIsNull() {
            addCriterion("m.total__End_Num is null");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumIsNotNull() {
            addCriterion("m.total__End_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumEqualTo(Integer value) {
            addCriterion("m.total__End_Num =", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumNotEqualTo(Integer value) {
            addCriterion("m.total__End_Num <>", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumGreaterThan(Integer value) {
            addCriterion("m.total__End_Num >", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total__End_Num >=", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumLessThan(Integer value) {
            addCriterion("m.total__End_Num <", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumLessThanOrEqualTo(Integer value) {
            addCriterion("m.total__End_Num <=", value, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumIn(List<Integer> values) {
            addCriterion("m.total__End_Num in", values, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumNotIn(List<Integer> values) {
            addCriterion("m.total__End_Num not in", values, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumBetween(Integer value1, Integer value2) {
            addCriterion("m.total__End_Num between", value1, value2, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalEndNumNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total__End_Num not between", value1, value2, "totalEndNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumIsNull() {
            addCriterion("m.total__OnAccount_Num is null");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumIsNotNull() {
            addCriterion("m.total__OnAccount_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumEqualTo(Integer value) {
            addCriterion("m.total__OnAccount_Num =", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumNotEqualTo(Integer value) {
            addCriterion("m.total__OnAccount_Num <>", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumGreaterThan(Integer value) {
            addCriterion("m.total__OnAccount_Num >", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.total__OnAccount_Num >=", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumLessThan(Integer value) {
            addCriterion("m.total__OnAccount_Num <", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumLessThanOrEqualTo(Integer value) {
            addCriterion("m.total__OnAccount_Num <=", value, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumIn(List<Integer> values) {
            addCriterion("m.total__OnAccount_Num in", values, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumNotIn(List<Integer> values) {
            addCriterion("m.total__OnAccount_Num not in", values, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumBetween(Integer value1, Integer value2) {
            addCriterion("m.total__OnAccount_Num between", value1, value2, "totalOnaccountNum");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountNumNotBetween(Integer value1, Integer value2) {
            addCriterion("m.total__OnAccount_Num not between", value1, value2, "totalOnaccountNum");
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

        public Criteria andTotalEndAmountIsNull() {
            addCriterion("m.total_End_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountIsNotNull() {
            addCriterion("m.total_End_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountEqualTo(BigDecimal value) {
            addCriterion("m.total_End_Amount =", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.total_End_Amount <>", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountGreaterThan(BigDecimal value) {
            addCriterion("m.total_End_Amount >", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_End_Amount >=", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountLessThan(BigDecimal value) {
            addCriterion("m.total_End_Amount <", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_End_Amount <=", value, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountIn(List<BigDecimal> values) {
            addCriterion("m.total_End_Amount in", values, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.total_End_Amount not in", values, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_End_Amount between", value1, value2, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEndAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_End_Amount not between", value1, value2, "totalEndAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountIsNull() {
            addCriterion("m.total_OnAccount_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountIsNotNull() {
            addCriterion("m.total_OnAccount_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountEqualTo(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount =", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount <>", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountGreaterThan(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount >", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount >=", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountLessThan(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount <", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.total_OnAccount_Amount <=", value, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountIn(List<BigDecimal> values) {
            addCriterion("m.total_OnAccount_Amount in", values, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.total_OnAccount_Amount not in", values, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_OnAccount_Amount between", value1, value2, "totalOnaccountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOnaccountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.total_OnAccount_Amount not between", value1, value2, "totalOnaccountAmount");
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