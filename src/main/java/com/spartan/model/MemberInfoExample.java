package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMemIdIsNull() {
            addCriterion("mem_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Integer value) {
            addCriterion("mem_ID =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Integer value) {
            addCriterion("mem_ID <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Integer value) {
            addCriterion("mem_ID >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mem_ID >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Integer value) {
            addCriterion("mem_ID <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("mem_ID <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Integer> values) {
            addCriterion("mem_ID in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Integer> values) {
            addCriterion("mem_ID not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Integer value1, Integer value2) {
            addCriterion("mem_ID between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mem_ID not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdIsNull() {
            addCriterion("mem_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdIsNotNull() {
            addCriterion("mem_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdEqualTo(Integer value) {
            addCriterion("mem_Type_ID =", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotEqualTo(Integer value) {
            addCriterion("mem_Type_ID <>", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdGreaterThan(Integer value) {
            addCriterion("mem_Type_ID >", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mem_Type_ID >=", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdLessThan(Integer value) {
            addCriterion("mem_Type_ID <", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mem_Type_ID <=", value, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdIn(List<Integer> values) {
            addCriterion("mem_Type_ID in", values, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotIn(List<Integer> values) {
            addCriterion("mem_Type_ID not in", values, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("mem_Type_ID between", value1, value2, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mem_Type_ID not between", value1, value2, "memTypeId");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNull() {
            addCriterion("mem_Name is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("mem_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("mem_Name =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("mem_Name <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("mem_Name >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("mem_Name >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("mem_Name <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("mem_Name <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("mem_Name like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("mem_Name not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("mem_Name in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("mem_Name not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("mem_Name between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("mem_Name not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameIsNull() {
            addCriterion("mem_User_Name is null");
            return (Criteria) this;
        }

        public Criteria andMemUserNameIsNotNull() {
            addCriterion("mem_User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMemUserNameEqualTo(String value) {
            addCriterion("mem_User_Name =", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameNotEqualTo(String value) {
            addCriterion("mem_User_Name <>", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameGreaterThan(String value) {
            addCriterion("mem_User_Name >", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("mem_User_Name >=", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameLessThan(String value) {
            addCriterion("mem_User_Name <", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameLessThanOrEqualTo(String value) {
            addCriterion("mem_User_Name <=", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameLike(String value) {
            addCriterion("mem_User_Name like", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameNotLike(String value) {
            addCriterion("mem_User_Name not like", value, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameIn(List<String> values) {
            addCriterion("mem_User_Name in", values, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameNotIn(List<String> values) {
            addCriterion("mem_User_Name not in", values, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameBetween(String value1, String value2) {
            addCriterion("mem_User_Name between", value1, value2, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemUserNameNotBetween(String value1, String value2) {
            addCriterion("mem_User_Name not between", value1, value2, "memUserName");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIsNull() {
            addCriterion("mem_Password is null");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIsNotNull() {
            addCriterion("mem_Password is not null");
            return (Criteria) this;
        }

        public Criteria andMemPasswordEqualTo(String value) {
            addCriterion("mem_Password =", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotEqualTo(String value) {
            addCriterion("mem_Password <>", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordGreaterThan(String value) {
            addCriterion("mem_Password >", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mem_Password >=", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLessThan(String value) {
            addCriterion("mem_Password <", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLessThanOrEqualTo(String value) {
            addCriterion("mem_Password <=", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLike(String value) {
            addCriterion("mem_Password like", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotLike(String value) {
            addCriterion("mem_Password not like", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIn(List<String> values) {
            addCriterion("mem_Password in", values, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotIn(List<String> values) {
            addCriterion("mem_Password not in", values, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordBetween(String value1, String value2) {
            addCriterion("mem_Password between", value1, value2, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotBetween(String value1, String value2) {
            addCriterion("mem_Password not between", value1, value2, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemTelIsNull() {
            addCriterion("mem_Tel is null");
            return (Criteria) this;
        }

        public Criteria andMemTelIsNotNull() {
            addCriterion("mem_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andMemTelEqualTo(String value) {
            addCriterion("mem_Tel =", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelNotEqualTo(String value) {
            addCriterion("mem_Tel <>", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelGreaterThan(String value) {
            addCriterion("mem_Tel >", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelGreaterThanOrEqualTo(String value) {
            addCriterion("mem_Tel >=", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelLessThan(String value) {
            addCriterion("mem_Tel <", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelLessThanOrEqualTo(String value) {
            addCriterion("mem_Tel <=", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelLike(String value) {
            addCriterion("mem_Tel like", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelNotLike(String value) {
            addCriterion("mem_Tel not like", value, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelIn(List<String> values) {
            addCriterion("mem_Tel in", values, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelNotIn(List<String> values) {
            addCriterion("mem_Tel not in", values, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelBetween(String value1, String value2) {
            addCriterion("mem_Tel between", value1, value2, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemTelNotBetween(String value1, String value2) {
            addCriterion("mem_Tel not between", value1, value2, "memTel");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIsNull() {
            addCriterion("mem_Phone is null");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIsNotNull() {
            addCriterion("mem_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andMemPhoneEqualTo(String value) {
            addCriterion("mem_Phone =", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotEqualTo(String value) {
            addCriterion("mem_Phone <>", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneGreaterThan(String value) {
            addCriterion("mem_Phone >", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mem_Phone >=", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLessThan(String value) {
            addCriterion("mem_Phone <", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLessThanOrEqualTo(String value) {
            addCriterion("mem_Phone <=", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLike(String value) {
            addCriterion("mem_Phone like", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotLike(String value) {
            addCriterion("mem_Phone not like", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIn(List<String> values) {
            addCriterion("mem_Phone in", values, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotIn(List<String> values) {
            addCriterion("mem_Phone not in", values, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneBetween(String value1, String value2) {
            addCriterion("mem_Phone between", value1, value2, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotBetween(String value1, String value2) {
            addCriterion("mem_Phone not between", value1, value2, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemAddressIsNull() {
            addCriterion("mem_Address is null");
            return (Criteria) this;
        }

        public Criteria andMemAddressIsNotNull() {
            addCriterion("mem_Address is not null");
            return (Criteria) this;
        }

        public Criteria andMemAddressEqualTo(String value) {
            addCriterion("mem_Address =", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotEqualTo(String value) {
            addCriterion("mem_Address <>", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressGreaterThan(String value) {
            addCriterion("mem_Address >", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mem_Address >=", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLessThan(String value) {
            addCriterion("mem_Address <", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLessThanOrEqualTo(String value) {
            addCriterion("mem_Address <=", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLike(String value) {
            addCriterion("mem_Address like", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotLike(String value) {
            addCriterion("mem_Address not like", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressIn(List<String> values) {
            addCriterion("mem_Address in", values, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotIn(List<String> values) {
            addCriterion("mem_Address not in", values, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressBetween(String value1, String value2) {
            addCriterion("mem_Address between", value1, value2, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotBetween(String value1, String value2) {
            addCriterion("mem_Address not between", value1, value2, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemGenderIsNull() {
            addCriterion("mem_Gender is null");
            return (Criteria) this;
        }

        public Criteria andMemGenderIsNotNull() {
            addCriterion("mem_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andMemGenderEqualTo(Byte value) {
            addCriterion("mem_Gender =", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderNotEqualTo(Byte value) {
            addCriterion("mem_Gender <>", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderGreaterThan(Byte value) {
            addCriterion("mem_Gender >", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("mem_Gender >=", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderLessThan(Byte value) {
            addCriterion("mem_Gender <", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderLessThanOrEqualTo(Byte value) {
            addCriterion("mem_Gender <=", value, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderIn(List<Byte> values) {
            addCriterion("mem_Gender in", values, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderNotIn(List<Byte> values) {
            addCriterion("mem_Gender not in", values, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderBetween(Byte value1, Byte value2) {
            addCriterion("mem_Gender between", value1, value2, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("mem_Gender not between", value1, value2, "memGender");
            return (Criteria) this;
        }

        public Criteria andMemMoneyIsNull() {
            addCriterion("mem_Money is null");
            return (Criteria) this;
        }

        public Criteria andMemMoneyIsNotNull() {
            addCriterion("mem_Money is not null");
            return (Criteria) this;
        }

        public Criteria andMemMoneyEqualTo(BigDecimal value) {
            addCriterion("mem_Money =", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyNotEqualTo(BigDecimal value) {
            addCriterion("mem_Money <>", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyGreaterThan(BigDecimal value) {
            addCriterion("mem_Money >", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mem_Money >=", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyLessThan(BigDecimal value) {
            addCriterion("mem_Money <", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mem_Money <=", value, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyIn(List<BigDecimal> values) {
            addCriterion("mem_Money in", values, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyNotIn(List<BigDecimal> values) {
            addCriterion("mem_Money not in", values, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mem_Money between", value1, value2, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mem_Money not between", value1, value2, "memMoney");
            return (Criteria) this;
        }

        public Criteria andMemIntegralIsNull() {
            addCriterion("mem_Integral is null");
            return (Criteria) this;
        }

        public Criteria andMemIntegralIsNotNull() {
            addCriterion("mem_Integral is not null");
            return (Criteria) this;
        }

        public Criteria andMemIntegralEqualTo(Integer value) {
            addCriterion("mem_Integral =", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralNotEqualTo(Integer value) {
            addCriterion("mem_Integral <>", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralGreaterThan(Integer value) {
            addCriterion("mem_Integral >", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("mem_Integral >=", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralLessThan(Integer value) {
            addCriterion("mem_Integral <", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("mem_Integral <=", value, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralIn(List<Integer> values) {
            addCriterion("mem_Integral in", values, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralNotIn(List<Integer> values) {
            addCriterion("mem_Integral not in", values, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralBetween(Integer value1, Integer value2) {
            addCriterion("mem_Integral between", value1, value2, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("mem_Integral not between", value1, value2, "memIntegral");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayIsNull() {
            addCriterion("mem_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayIsNotNull() {
            addCriterion("mem_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Birthday =", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Birthday <>", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("mem_Birthday >", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Birthday >=", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("mem_Birthday <", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Birthday <=", value, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("mem_Birthday in", values, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("mem_Birthday not in", values, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_Birthday between", value1, value2, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_Birthday not between", value1, value2, "memBirthday");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeIsNull() {
            addCriterion("mem_Begin_Time is null");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeIsNotNull() {
            addCriterion("mem_Begin_Time is not null");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time =", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time <>", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time >", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time >=", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time <", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_Begin_Time <=", value, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("mem_Begin_Time in", values, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("mem_Begin_Time not in", values, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_Begin_Time between", value1, value2, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_Begin_Time not between", value1, value2, "memBeginTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeIsNull() {
            addCriterion("mem_End_Time is null");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeIsNotNull() {
            addCriterion("mem_End_Time is not null");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("mem_End_Time =", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("mem_End_Time <>", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("mem_End_Time >", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_End_Time >=", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("mem_End_Time <", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mem_End_Time <=", value, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("mem_End_Time in", values, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("mem_End_Time not in", values, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_End_Time between", value1, value2, "memEndTime");
            return (Criteria) this;
        }

        public Criteria andMemEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mem_End_Time not between", value1, value2, "memEndTime");
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