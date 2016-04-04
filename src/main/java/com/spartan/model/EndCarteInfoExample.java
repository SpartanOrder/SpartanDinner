package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EndCarteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EndCarteInfoExample() {
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

        public Criteria andEciIdIsNull() {
            addCriterion("ECI_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciIdIsNotNull() {
            addCriterion("ECI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciIdEqualTo(Integer value) {
            addCriterion("ECI_ID =", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotEqualTo(Integer value) {
            addCriterion("ECI_ID <>", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdGreaterThan(Integer value) {
            addCriterion("ECI_ID >", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_ID >=", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdLessThan(Integer value) {
            addCriterion("ECI_ID <", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_ID <=", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdIn(List<Integer> values) {
            addCriterion("ECI_ID in", values, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotIn(List<Integer> values) {
            addCriterion("ECI_ID not in", values, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_ID between", value1, value2, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_ID not between", value1, value2, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberIsNull() {
            addCriterion("ECI_Swift_Number is null");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberIsNotNull() {
            addCriterion("ECI_Swift_Number is not null");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberEqualTo(String value) {
            addCriterion("ECI_Swift_Number =", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberNotEqualTo(String value) {
            addCriterion("ECI_Swift_Number <>", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberGreaterThan(String value) {
            addCriterion("ECI_Swift_Number >", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ECI_Swift_Number >=", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberLessThan(String value) {
            addCriterion("ECI_Swift_Number <", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("ECI_Swift_Number <=", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberLike(String value) {
            addCriterion("ECI_Swift_Number like", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberNotLike(String value) {
            addCriterion("ECI_Swift_Number not like", value, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberIn(List<String> values) {
            addCriterion("ECI_Swift_Number in", values, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberNotIn(List<String> values) {
            addCriterion("ECI_Swift_Number not in", values, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberBetween(String value1, String value2) {
            addCriterion("ECI_Swift_Number between", value1, value2, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("ECI_Swift_Number not between", value1, value2, "eciSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andEciStateIsNull() {
            addCriterion("ECI_State is null");
            return (Criteria) this;
        }

        public Criteria andEciStateIsNotNull() {
            addCriterion("ECI_State is not null");
            return (Criteria) this;
        }

        public Criteria andEciStateEqualTo(Byte value) {
            addCriterion("ECI_State =", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateNotEqualTo(Byte value) {
            addCriterion("ECI_State <>", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateGreaterThan(Byte value) {
            addCriterion("ECI_State >", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("ECI_State >=", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateLessThan(Byte value) {
            addCriterion("ECI_State <", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateLessThanOrEqualTo(Byte value) {
            addCriterion("ECI_State <=", value, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateIn(List<Byte> values) {
            addCriterion("ECI_State in", values, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateNotIn(List<Byte> values) {
            addCriterion("ECI_State not in", values, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateBetween(Byte value1, Byte value2) {
            addCriterion("ECI_State between", value1, value2, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciStateNotBetween(Byte value1, Byte value2) {
            addCriterion("ECI_State not between", value1, value2, "eciState");
            return (Criteria) this;
        }

        public Criteria andEciTableIdIsNull() {
            addCriterion("ECI_Table_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciTableIdIsNotNull() {
            addCriterion("ECI_Table_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciTableIdEqualTo(Integer value) {
            addCriterion("ECI_Table_ID =", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdNotEqualTo(Integer value) {
            addCriterion("ECI_Table_ID <>", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdGreaterThan(Integer value) {
            addCriterion("ECI_Table_ID >", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Table_ID >=", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdLessThan(Integer value) {
            addCriterion("ECI_Table_ID <", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Table_ID <=", value, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdIn(List<Integer> values) {
            addCriterion("ECI_Table_ID in", values, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdNotIn(List<Integer> values) {
            addCriterion("ECI_Table_ID not in", values, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Table_ID between", value1, value2, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Table_ID not between", value1, value2, "eciTableId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdIsNull() {
            addCriterion("ECI_Waiter_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdIsNotNull() {
            addCriterion("ECI_Waiter_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdEqualTo(Integer value) {
            addCriterion("ECI_Waiter_ID =", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdNotEqualTo(Integer value) {
            addCriterion("ECI_Waiter_ID <>", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdGreaterThan(Integer value) {
            addCriterion("ECI_Waiter_ID >", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Waiter_ID >=", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdLessThan(Integer value) {
            addCriterion("ECI_Waiter_ID <", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Waiter_ID <=", value, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdIn(List<Integer> values) {
            addCriterion("ECI_Waiter_ID in", values, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdNotIn(List<Integer> values) {
            addCriterion("ECI_Waiter_ID not in", values, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Waiter_ID between", value1, value2, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciWaiterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Waiter_ID not between", value1, value2, "eciWaiterId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdIsNull() {
            addCriterion("ECI_Cashier_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdIsNotNull() {
            addCriterion("ECI_Cashier_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdEqualTo(Integer value) {
            addCriterion("ECI_Cashier_ID =", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdNotEqualTo(Integer value) {
            addCriterion("ECI_Cashier_ID <>", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdGreaterThan(Integer value) {
            addCriterion("ECI_Cashier_ID >", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Cashier_ID >=", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdLessThan(Integer value) {
            addCriterion("ECI_Cashier_ID <", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Cashier_ID <=", value, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdIn(List<Integer> values) {
            addCriterion("ECI_Cashier_ID in", values, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdNotIn(List<Integer> values) {
            addCriterion("ECI_Cashier_ID not in", values, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Cashier_ID between", value1, value2, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCashierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Cashier_ID not between", value1, value2, "eciCashierId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdIsNull() {
            addCriterion("ECI_Customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdIsNotNull() {
            addCriterion("ECI_Customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdEqualTo(Integer value) {
            addCriterion("ECI_Customer_ID =", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdNotEqualTo(Integer value) {
            addCriterion("ECI_Customer_ID <>", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdGreaterThan(Integer value) {
            addCriterion("ECI_Customer_ID >", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Customer_ID >=", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdLessThan(Integer value) {
            addCriterion("ECI_Customer_ID <", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Customer_ID <=", value, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdIn(List<Integer> values) {
            addCriterion("ECI_Customer_ID in", values, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdNotIn(List<Integer> values) {
            addCriterion("ECI_Customer_ID not in", values, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Customer_ID between", value1, value2, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Customer_ID not between", value1, value2, "eciCustomerId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdIsNull() {
            addCriterion("ECI_Mem_ID is null");
            return (Criteria) this;
        }

        public Criteria andEciMemIdIsNotNull() {
            addCriterion("ECI_Mem_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEciMemIdEqualTo(Integer value) {
            addCriterion("ECI_Mem_ID =", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdNotEqualTo(Integer value) {
            addCriterion("ECI_Mem_ID <>", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdGreaterThan(Integer value) {
            addCriterion("ECI_Mem_ID >", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Mem_ID >=", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdLessThan(Integer value) {
            addCriterion("ECI_Mem_ID <", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Mem_ID <=", value, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdIn(List<Integer> values) {
            addCriterion("ECI_Mem_ID in", values, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdNotIn(List<Integer> values) {
            addCriterion("ECI_Mem_ID not in", values, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Mem_ID between", value1, value2, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Mem_ID not between", value1, value2, "eciMemId");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsIsNull() {
            addCriterion("ECI_Dish_Nums is null");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsIsNotNull() {
            addCriterion("ECI_Dish_Nums is not null");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsEqualTo(Integer value) {
            addCriterion("ECI_Dish_Nums =", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsNotEqualTo(Integer value) {
            addCriterion("ECI_Dish_Nums <>", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsGreaterThan(Integer value) {
            addCriterion("ECI_Dish_Nums >", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Dish_Nums >=", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsLessThan(Integer value) {
            addCriterion("ECI_Dish_Nums <", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Dish_Nums <=", value, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsIn(List<Integer> values) {
            addCriterion("ECI_Dish_Nums in", values, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsNotIn(List<Integer> values) {
            addCriterion("ECI_Dish_Nums not in", values, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Dish_Nums between", value1, value2, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciDishNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Dish_Nums not between", value1, value2, "eciDishNums");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploIsNull() {
            addCriterion("ECI_Amount_Peoplo is null");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploIsNotNull() {
            addCriterion("ECI_Amount_Peoplo is not null");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploEqualTo(Integer value) {
            addCriterion("ECI_Amount_Peoplo =", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploNotEqualTo(Integer value) {
            addCriterion("ECI_Amount_Peoplo <>", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploGreaterThan(Integer value) {
            addCriterion("ECI_Amount_Peoplo >", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECI_Amount_Peoplo >=", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploLessThan(Integer value) {
            addCriterion("ECI_Amount_Peoplo <", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploLessThanOrEqualTo(Integer value) {
            addCriterion("ECI_Amount_Peoplo <=", value, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploIn(List<Integer> values) {
            addCriterion("ECI_Amount_Peoplo in", values, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploNotIn(List<Integer> values) {
            addCriterion("ECI_Amount_Peoplo not in", values, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Amount_Peoplo between", value1, value2, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciAmountPeoploNotBetween(Integer value1, Integer value2) {
            addCriterion("ECI_Amount_Peoplo not between", value1, value2, "eciAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeIsNull() {
            addCriterion("ECI_Repast_Time is null");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeIsNotNull() {
            addCriterion("ECI_Repast_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeEqualTo(Date value) {
            addCriterion("ECI_Repast_Time =", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeNotEqualTo(Date value) {
            addCriterion("ECI_Repast_Time <>", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeGreaterThan(Date value) {
            addCriterion("ECI_Repast_Time >", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ECI_Repast_Time >=", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeLessThan(Date value) {
            addCriterion("ECI_Repast_Time <", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeLessThanOrEqualTo(Date value) {
            addCriterion("ECI_Repast_Time <=", value, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeIn(List<Date> values) {
            addCriterion("ECI_Repast_Time in", values, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeNotIn(List<Date> values) {
            addCriterion("ECI_Repast_Time not in", values, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeBetween(Date value1, Date value2) {
            addCriterion("ECI_Repast_Time between", value1, value2, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciRepastTimeNotBetween(Date value1, Date value2) {
            addCriterion("ECI_Repast_Time not between", value1, value2, "eciRepastTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeIsNull() {
            addCriterion("ECI_Bill_Time is null");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeIsNotNull() {
            addCriterion("ECI_Bill_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeEqualTo(Date value) {
            addCriterion("ECI_Bill_Time =", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeNotEqualTo(Date value) {
            addCriterion("ECI_Bill_Time <>", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeGreaterThan(Date value) {
            addCriterion("ECI_Bill_Time >", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ECI_Bill_Time >=", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeLessThan(Date value) {
            addCriterion("ECI_Bill_Time <", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeLessThanOrEqualTo(Date value) {
            addCriterion("ECI_Bill_Time <=", value, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeIn(List<Date> values) {
            addCriterion("ECI_Bill_Time in", values, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeNotIn(List<Date> values) {
            addCriterion("ECI_Bill_Time not in", values, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeBetween(Date value1, Date value2) {
            addCriterion("ECI_Bill_Time between", value1, value2, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciBillTimeNotBetween(Date value1, Date value2) {
            addCriterion("ECI_Bill_Time not between", value1, value2, "eciBillTime");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodIsNull() {
            addCriterion("ECI_Pay_Method is null");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodIsNotNull() {
            addCriterion("ECI_Pay_Method is not null");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodEqualTo(String value) {
            addCriterion("ECI_Pay_Method =", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodNotEqualTo(String value) {
            addCriterion("ECI_Pay_Method <>", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodGreaterThan(String value) {
            addCriterion("ECI_Pay_Method >", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ECI_Pay_Method >=", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodLessThan(String value) {
            addCriterion("ECI_Pay_Method <", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodLessThanOrEqualTo(String value) {
            addCriterion("ECI_Pay_Method <=", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodLike(String value) {
            addCriterion("ECI_Pay_Method like", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodNotLike(String value) {
            addCriterion("ECI_Pay_Method not like", value, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodIn(List<String> values) {
            addCriterion("ECI_Pay_Method in", values, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodNotIn(List<String> values) {
            addCriterion("ECI_Pay_Method not in", values, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodBetween(String value1, String value2) {
            addCriterion("ECI_Pay_Method between", value1, value2, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciPayMethodNotBetween(String value1, String value2) {
            addCriterion("ECI_Pay_Method not between", value1, value2, "eciPayMethod");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountIsNull() {
            addCriterion("ECI_Consume_Amount is null");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountIsNotNull() {
            addCriterion("ECI_Consume_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("ECI_Consume_Amount =", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("ECI_Consume_Amount <>", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("ECI_Consume_Amount >", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Consume_Amount >=", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountLessThan(BigDecimal value) {
            addCriterion("ECI_Consume_Amount <", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Consume_Amount <=", value, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("ECI_Consume_Amount in", values, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("ECI_Consume_Amount not in", values, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Consume_Amount between", value1, value2, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Consume_Amount not between", value1, value2, "eciConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountIsNull() {
            addCriterion("ECI_Discount is null");
            return (Criteria) this;
        }

        public Criteria andEciDiscountIsNotNull() {
            addCriterion("ECI_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andEciDiscountEqualTo(BigDecimal value) {
            addCriterion("ECI_Discount =", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountNotEqualTo(BigDecimal value) {
            addCriterion("ECI_Discount <>", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountGreaterThan(BigDecimal value) {
            addCriterion("ECI_Discount >", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Discount >=", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountLessThan(BigDecimal value) {
            addCriterion("ECI_Discount <", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Discount <=", value, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountIn(List<BigDecimal> values) {
            addCriterion("ECI_Discount in", values, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountNotIn(List<BigDecimal> values) {
            addCriterion("ECI_Discount not in", values, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Discount between", value1, value2, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Discount not between", value1, value2, "eciDiscount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountIsNull() {
            addCriterion("ECI_Paid_Amount is null");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountIsNotNull() {
            addCriterion("ECI_Paid_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountEqualTo(BigDecimal value) {
            addCriterion("ECI_Paid_Amount =", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("ECI_Paid_Amount <>", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("ECI_Paid_Amount >", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Paid_Amount >=", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountLessThan(BigDecimal value) {
            addCriterion("ECI_Paid_Amount <", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ECI_Paid_Amount <=", value, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountIn(List<BigDecimal> values) {
            addCriterion("ECI_Paid_Amount in", values, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("ECI_Paid_Amount not in", values, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Paid_Amount between", value1, value2, "eciPaidAmount");
            return (Criteria) this;
        }

        public Criteria andEciPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECI_Paid_Amount not between", value1, value2, "eciPaidAmount");
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