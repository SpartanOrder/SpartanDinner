package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempCarteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempCarteInfoExample() {
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

        public Criteria andTciIdIsNull() {
            addCriterion("m.TCI_ID is null");
            return (Criteria) this;
        }

        public Criteria andTciIdIsNotNull() {
            addCriterion("m.TCI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTciIdEqualTo(Integer value) {
            addCriterion("m.TCI_ID =", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdNotEqualTo(Integer value) {
            addCriterion("m.TCI_ID <>", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdGreaterThan(Integer value) {
            addCriterion("m.TCI_ID >", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_ID >=", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdLessThan(Integer value) {
            addCriterion("m.TCI_ID <", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_ID <=", value, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdIn(List<Integer> values) {
            addCriterion("m.TCI_ID in", values, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdNotIn(List<Integer> values) {
            addCriterion("m.TCI_ID not in", values, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_ID between", value1, value2, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_ID not between", value1, value2, "tciId");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberIsNull() {
            addCriterion("m.TCI_Swift_Number is null");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberIsNotNull() {
            addCriterion("m.TCI_Swift_Number is not null");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberEqualTo(String value) {
            addCriterion("m.TCI_Swift_Number =", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberNotEqualTo(String value) {
            addCriterion("m.TCI_Swift_Number <>", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberGreaterThan(String value) {
            addCriterion("m.TCI_Swift_Number >", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("m.TCI_Swift_Number >=", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberLessThan(String value) {
            addCriterion("m.TCI_Swift_Number <", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("m.TCI_Swift_Number <=", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberLike(String value) {
            addCriterion("m.TCI_Swift_Number like", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberNotLike(String value) {
            addCriterion("m.TCI_Swift_Number not like", value, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberIn(List<String> values) {
            addCriterion("m.TCI_Swift_Number in", values, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberNotIn(List<String> values) {
            addCriterion("m.TCI_Swift_Number not in", values, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberBetween(String value1, String value2) {
            addCriterion("m.TCI_Swift_Number between", value1, value2, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("m.TCI_Swift_Number not between", value1, value2, "tciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andTciStateIsNull() {
            addCriterion("m.TCI_State is null");
            return (Criteria) this;
        }

        public Criteria andTciStateIsNotNull() {
            addCriterion("m.TCI_State is not null");
            return (Criteria) this;
        }

        public Criteria andTciStateEqualTo(Byte value) {
            addCriterion("m.TCI_State =", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateNotEqualTo(Byte value) {
            addCriterion("m.TCI_State <>", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateGreaterThan(Byte value) {
            addCriterion("m.TCI_State >", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("m.TCI_State >=", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateLessThan(Byte value) {
            addCriterion("m.TCI_State <", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateLessThanOrEqualTo(Byte value) {
            addCriterion("m.TCI_State <=", value, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateIn(List<Byte> values) {
            addCriterion("m.TCI_State in", values, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateNotIn(List<Byte> values) {
            addCriterion("m.TCI_State not in", values, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateBetween(Byte value1, Byte value2) {
            addCriterion("m.TCI_State between", value1, value2, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciStateNotBetween(Byte value1, Byte value2) {
            addCriterion("m.TCI_State not between", value1, value2, "tciState");
            return (Criteria) this;
        }

        public Criteria andTciTableIdIsNull() {
            addCriterion("m.TCI_Table_ID is null");
            return (Criteria) this;
        }

        public Criteria andTciTableIdIsNotNull() {
            addCriterion("m.TCI_Table_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTciTableIdEqualTo(Integer value) {
            addCriterion("m.TCI_Table_ID =", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdNotEqualTo(Integer value) {
            addCriterion("m.TCI_Table_ID <>", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdGreaterThan(Integer value) {
            addCriterion("m.TCI_Table_ID >", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Table_ID >=", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdLessThan(Integer value) {
            addCriterion("m.TCI_Table_ID <", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Table_ID <=", value, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdIn(List<Integer> values) {
            addCriterion("m.TCI_Table_ID in", values, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdNotIn(List<Integer> values) {
            addCriterion("m.TCI_Table_ID not in", values, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Table_ID between", value1, value2, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Table_ID not between", value1, value2, "tciTableId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdIsNull() {
            addCriterion("m.TCI_Customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdIsNotNull() {
            addCriterion("m.TCI_Customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdEqualTo(Integer value) {
            addCriterion("m.TCI_Customer_ID =", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdNotEqualTo(Integer value) {
            addCriterion("m.TCI_Customer_ID <>", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdGreaterThan(Integer value) {
            addCriterion("m.TCI_Customer_ID >", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Customer_ID >=", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdLessThan(Integer value) {
            addCriterion("m.TCI_Customer_ID <", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Customer_ID <=", value, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdIn(List<Integer> values) {
            addCriterion("m.TCI_Customer_ID in", values, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdNotIn(List<Integer> values) {
            addCriterion("m.TCI_Customer_ID not in", values, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Customer_ID between", value1, value2, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Customer_ID not between", value1, value2, "tciCustomerId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdIsNull() {
            addCriterion("m.TCI_Mem_ID is null");
            return (Criteria) this;
        }

        public Criteria andTciMemIdIsNotNull() {
            addCriterion("m.TCI_Mem_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTciMemIdEqualTo(Integer value) {
            addCriterion("m.TCI_Mem_ID =", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdNotEqualTo(Integer value) {
            addCriterion("m.TCI_Mem_ID <>", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdGreaterThan(Integer value) {
            addCriterion("m.TCI_Mem_ID >", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Mem_ID >=", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdLessThan(Integer value) {
            addCriterion("m.TCI_Mem_ID <", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Mem_ID <=", value, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdIn(List<Integer> values) {
            addCriterion("m.TCI_Mem_ID in", values, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdNotIn(List<Integer> values) {
            addCriterion("m.TCI_Mem_ID not in", values, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Mem_ID between", value1, value2, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Mem_ID not between", value1, value2, "tciMemId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdIsNull() {
            addCriterion("m.TCI_Waiter_ID is null");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdIsNotNull() {
            addCriterion("m.TCI_Waiter_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdEqualTo(Integer value) {
            addCriterion("m.TCI_Waiter_ID =", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdNotEqualTo(Integer value) {
            addCriterion("m.TCI_Waiter_ID <>", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdGreaterThan(Integer value) {
            addCriterion("m.TCI_Waiter_ID >", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Waiter_ID >=", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdLessThan(Integer value) {
            addCriterion("m.TCI_Waiter_ID <", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Waiter_ID <=", value, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdIn(List<Integer> values) {
            addCriterion("m.TCI_Waiter_ID in", values, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdNotIn(List<Integer> values) {
            addCriterion("m.TCI_Waiter_ID not in", values, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Waiter_ID between", value1, value2, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciWaiterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Waiter_ID not between", value1, value2, "tciWaiterId");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsIsNull() {
            addCriterion("m.TCI_Dish_Nums is null");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsIsNotNull() {
            addCriterion("m.TCI_Dish_Nums is not null");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsEqualTo(Integer value) {
            addCriterion("m.TCI_Dish_Nums =", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsNotEqualTo(Integer value) {
            addCriterion("m.TCI_Dish_Nums <>", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsGreaterThan(Integer value) {
            addCriterion("m.TCI_Dish_Nums >", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Dish_Nums >=", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsLessThan(Integer value) {
            addCriterion("m.TCI_Dish_Nums <", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Dish_Nums <=", value, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsIn(List<Integer> values) {
            addCriterion("m.TCI_Dish_Nums in", values, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsNotIn(List<Integer> values) {
            addCriterion("m.TCI_Dish_Nums not in", values, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Dish_Nums between", value1, value2, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciDishNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Dish_Nums not between", value1, value2, "tciDishNums");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploIsNull() {
            addCriterion("m.TCI_Amount_Peoplo is null");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploIsNotNull() {
            addCriterion("m.TCI_Amount_Peoplo is not null");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploEqualTo(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo =", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploNotEqualTo(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo <>", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploGreaterThan(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo >", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo >=", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploLessThan(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo <", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploLessThanOrEqualTo(Integer value) {
            addCriterion("m.TCI_Amount_Peoplo <=", value, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploIn(List<Integer> values) {
            addCriterion("m.TCI_Amount_Peoplo in", values, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploNotIn(List<Integer> values) {
            addCriterion("m.TCI_Amount_Peoplo not in", values, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Amount_Peoplo between", value1, value2, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciAmountPeoploNotBetween(Integer value1, Integer value2) {
            addCriterion("m.TCI_Amount_Peoplo not between", value1, value2, "tciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeIsNull() {
            addCriterion("m.TCI_Repast_Time is null");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeIsNotNull() {
            addCriterion("m.TCI_Repast_Time is not null");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeEqualTo(Date value) {
            addCriterion("m.TCI_Repast_Time =", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeNotEqualTo(Date value) {
            addCriterion("m.TCI_Repast_Time <>", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeGreaterThan(Date value) {
            addCriterion("m.TCI_Repast_Time >", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m.TCI_Repast_Time >=", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeLessThan(Date value) {
            addCriterion("m.TCI_Repast_Time <", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeLessThanOrEqualTo(Date value) {
            addCriterion("m.TCI_Repast_Time <=", value, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeIn(List<Date> values) {
            addCriterion("m.TCI_Repast_Time in", values, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeNotIn(List<Date> values) {
            addCriterion("m.TCI_Repast_Time not in", values, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeBetween(Date value1, Date value2) {
            addCriterion("m.TCI_Repast_Time between", value1, value2, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciRepastTimeNotBetween(Date value1, Date value2) {
            addCriterion("m.TCI_Repast_Time not between", value1, value2, "tciRepastTime");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountIsNull() {
            addCriterion("m.TCI_Consume_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountIsNotNull() {
            addCriterion("m.TCI_Consume_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount =", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount <>", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount >", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount >=", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountLessThan(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount <", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Consume_Amount <=", value, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Consume_Amount in", values, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Consume_Amount not in", values, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Consume_Amount between", value1, value2, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Consume_Amount not between", value1, value2, "tciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountIsNull() {
            addCriterion("m.TCI_Cost_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountIsNotNull() {
            addCriterion("m.TCI_Cost_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount =", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount <>", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountGreaterThan(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount >", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount >=", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountLessThan(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount <", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Cost_Amount <=", value, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Cost_Amount in", values, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Cost_Amount not in", values, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Cost_Amount between", value1, value2, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciCostAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Cost_Amount not between", value1, value2, "tciCostAmount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountIsNull() {
            addCriterion("m.TCI_Discount is null");
            return (Criteria) this;
        }

        public Criteria andTciDiscountIsNotNull() {
            addCriterion("m.TCI_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andTciDiscountEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Discount =", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountNotEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Discount <>", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountGreaterThan(BigDecimal value) {
            addCriterion("m.TCI_Discount >", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Discount >=", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountLessThan(BigDecimal value) {
            addCriterion("m.TCI_Discount <", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.TCI_Discount <=", value, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Discount in", values, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountNotIn(List<BigDecimal> values) {
            addCriterion("m.TCI_Discount not in", values, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Discount between", value1, value2, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.TCI_Discount not between", value1, value2, "tciDiscount");
            return (Criteria) this;
        }

        public Criteria andTciRemarkIsNull() {
            addCriterion("m.TCI_Remark is null");
            return (Criteria) this;
        }

        public Criteria andTciRemarkIsNotNull() {
            addCriterion("m.TCI_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andTciRemarkEqualTo(String value) {
            addCriterion("m.TCI_Remark =", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkNotEqualTo(String value) {
            addCriterion("m.TCI_Remark <>", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkGreaterThan(String value) {
            addCriterion("m.TCI_Remark >", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("m.TCI_Remark >=", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkLessThan(String value) {
            addCriterion("m.TCI_Remark <", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkLessThanOrEqualTo(String value) {
            addCriterion("m.TCI_Remark <=", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkLike(String value) {
            addCriterion("m.TCI_Remark like", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkNotLike(String value) {
            addCriterion("m.TCI_Remark not like", value, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkIn(List<String> values) {
            addCriterion("m.TCI_Remark in", values, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkNotIn(List<String> values) {
            addCriterion("m.TCI_Remark not in", values, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkBetween(String value1, String value2) {
            addCriterion("m.TCI_Remark between", value1, value2, "tciRemark");
            return (Criteria) this;
        }

        public Criteria andTciRemarkNotBetween(String value1, String value2) {
            addCriterion("m.TCI_Remark not between", value1, value2, "tciRemark");
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