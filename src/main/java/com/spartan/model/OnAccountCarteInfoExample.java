package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnAccountCarteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnAccountCarteInfoExample() {
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

        public Criteria andOciIdIsNull() {
            addCriterion("m.OCI_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciIdIsNotNull() {
            addCriterion("m.OCI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciIdEqualTo(Integer value) {
            addCriterion("m.OCI_ID =", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_ID <>", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdGreaterThan(Integer value) {
            addCriterion("m.OCI_ID >", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_ID >=", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdLessThan(Integer value) {
            addCriterion("m.OCI_ID <", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_ID <=", value, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdIn(List<Integer> values) {
            addCriterion("m.OCI_ID in", values, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_ID not in", values, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_ID between", value1, value2, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_ID not between", value1, value2, "ociId");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberIsNull() {
            addCriterion("m.OCI_Swift_Number is null");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberIsNotNull() {
            addCriterion("m.OCI_Swift_Number is not null");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberEqualTo(String value) {
            addCriterion("m.OCI_Swift_Number =", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberNotEqualTo(String value) {
            addCriterion("m.OCI_Swift_Number <>", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberGreaterThan(String value) {
            addCriterion("m.OCI_Swift_Number >", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("m.OCI_Swift_Number >=", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberLessThan(String value) {
            addCriterion("m.OCI_Swift_Number <", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("m.OCI_Swift_Number <=", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberLike(String value) {
            addCriterion("m.OCI_Swift_Number like", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberNotLike(String value) {
            addCriterion("m.OCI_Swift_Number not like", value, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberIn(List<String> values) {
            addCriterion("m.OCI_Swift_Number in", values, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberNotIn(List<String> values) {
            addCriterion("m.OCI_Swift_Number not in", values, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberBetween(String value1, String value2) {
            addCriterion("m.OCI_Swift_Number between", value1, value2, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("m.OCI_Swift_Number not between", value1, value2, "ociSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andOciStateIsNull() {
            addCriterion("m.OCI_State is null");
            return (Criteria) this;
        }

        public Criteria andOciStateIsNotNull() {
            addCriterion("m.OCI_State is not null");
            return (Criteria) this;
        }

        public Criteria andOciStateEqualTo(Byte value) {
            addCriterion("m.OCI_State =", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateNotEqualTo(Byte value) {
            addCriterion("m.OCI_State <>", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateGreaterThan(Byte value) {
            addCriterion("m.OCI_State >", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("m.OCI_State >=", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateLessThan(Byte value) {
            addCriterion("m.OCI_State <", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateLessThanOrEqualTo(Byte value) {
            addCriterion("m.OCI_State <=", value, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateIn(List<Byte> values) {
            addCriterion("m.OCI_State in", values, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateNotIn(List<Byte> values) {
            addCriterion("m.OCI_State not in", values, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateBetween(Byte value1, Byte value2) {
            addCriterion("m.OCI_State between", value1, value2, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciStateNotBetween(Byte value1, Byte value2) {
            addCriterion("m.OCI_State not between", value1, value2, "ociState");
            return (Criteria) this;
        }

        public Criteria andOciTableIdIsNull() {
            addCriterion("m.OCI_Table_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciTableIdIsNotNull() {
            addCriterion("m.OCI_Table_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciTableIdEqualTo(Integer value) {
            addCriterion("m.OCI_Table_ID =", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_Table_ID <>", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdGreaterThan(Integer value) {
            addCriterion("m.OCI_Table_ID >", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Table_ID >=", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdLessThan(Integer value) {
            addCriterion("m.OCI_Table_ID <", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Table_ID <=", value, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdIn(List<Integer> values) {
            addCriterion("m.OCI_Table_ID in", values, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_Table_ID not in", values, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Table_ID between", value1, value2, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Table_ID not between", value1, value2, "ociTableId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdIsNull() {
            addCriterion("m.OCI_Waiter_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdIsNotNull() {
            addCriterion("m.OCI_Waiter_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdEqualTo(Integer value) {
            addCriterion("m.OCI_Waiter_ID =", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_Waiter_ID <>", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdGreaterThan(Integer value) {
            addCriterion("m.OCI_Waiter_ID >", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Waiter_ID >=", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdLessThan(Integer value) {
            addCriterion("m.OCI_Waiter_ID <", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Waiter_ID <=", value, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdIn(List<Integer> values) {
            addCriterion("m.OCI_Waiter_ID in", values, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_Waiter_ID not in", values, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Waiter_ID between", value1, value2, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciWaiterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Waiter_ID not between", value1, value2, "ociWaiterId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdIsNull() {
            addCriterion("m.OCI_Cashier_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdIsNotNull() {
            addCriterion("m.OCI_Cashier_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdEqualTo(Integer value) {
            addCriterion("m.OCI_Cashier_ID =", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_Cashier_ID <>", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdGreaterThan(Integer value) {
            addCriterion("m.OCI_Cashier_ID >", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Cashier_ID >=", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdLessThan(Integer value) {
            addCriterion("m.OCI_Cashier_ID <", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Cashier_ID <=", value, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdIn(List<Integer> values) {
            addCriterion("m.OCI_Cashier_ID in", values, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_Cashier_ID not in", values, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Cashier_ID between", value1, value2, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCashierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Cashier_ID not between", value1, value2, "ociCashierId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdIsNull() {
            addCriterion("m.OCI_Customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdIsNotNull() {
            addCriterion("m.OCI_Customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdEqualTo(Integer value) {
            addCriterion("m.OCI_Customer_ID =", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_Customer_ID <>", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdGreaterThan(Integer value) {
            addCriterion("m.OCI_Customer_ID >", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Customer_ID >=", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdLessThan(Integer value) {
            addCriterion("m.OCI_Customer_ID <", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Customer_ID <=", value, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdIn(List<Integer> values) {
            addCriterion("m.OCI_Customer_ID in", values, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_Customer_ID not in", values, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Customer_ID between", value1, value2, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Customer_ID not between", value1, value2, "ociCustomerId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdIsNull() {
            addCriterion("m.OCI_Mem_ID is null");
            return (Criteria) this;
        }

        public Criteria andOciMemIdIsNotNull() {
            addCriterion("m.OCI_Mem_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOciMemIdEqualTo(Integer value) {
            addCriterion("m.OCI_Mem_ID =", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdNotEqualTo(Integer value) {
            addCriterion("m.OCI_Mem_ID <>", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdGreaterThan(Integer value) {
            addCriterion("m.OCI_Mem_ID >", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Mem_ID >=", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdLessThan(Integer value) {
            addCriterion("m.OCI_Mem_ID <", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Mem_ID <=", value, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdIn(List<Integer> values) {
            addCriterion("m.OCI_Mem_ID in", values, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdNotIn(List<Integer> values) {
            addCriterion("m.OCI_Mem_ID not in", values, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Mem_ID between", value1, value2, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Mem_ID not between", value1, value2, "ociMemId");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsIsNull() {
            addCriterion("m.OCI_Dish_Nums is null");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsIsNotNull() {
            addCriterion("m.OCI_Dish_Nums is not null");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsEqualTo(Integer value) {
            addCriterion("m.OCI_Dish_Nums =", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsNotEqualTo(Integer value) {
            addCriterion("m.OCI_Dish_Nums <>", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsGreaterThan(Integer value) {
            addCriterion("m.OCI_Dish_Nums >", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Dish_Nums >=", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsLessThan(Integer value) {
            addCriterion("m.OCI_Dish_Nums <", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Dish_Nums <=", value, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsIn(List<Integer> values) {
            addCriterion("m.OCI_Dish_Nums in", values, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsNotIn(List<Integer> values) {
            addCriterion("m.OCI_Dish_Nums not in", values, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Dish_Nums between", value1, value2, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciDishNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Dish_Nums not between", value1, value2, "ociDishNums");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploIsNull() {
            addCriterion("m.OCI_Amount_Peoplo is null");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploIsNotNull() {
            addCriterion("m.OCI_Amount_Peoplo is not null");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploEqualTo(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo =", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploNotEqualTo(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo <>", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploGreaterThan(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo >", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo >=", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploLessThan(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo <", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploLessThanOrEqualTo(Integer value) {
            addCriterion("m.OCI_Amount_Peoplo <=", value, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploIn(List<Integer> values) {
            addCriterion("m.OCI_Amount_Peoplo in", values, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploNotIn(List<Integer> values) {
            addCriterion("m.OCI_Amount_Peoplo not in", values, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Amount_Peoplo between", value1, value2, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciAmountPeoploNotBetween(Integer value1, Integer value2) {
            addCriterion("m.OCI_Amount_Peoplo not between", value1, value2, "ociAmountPeoplo");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeIsNull() {
            addCriterion("m.OCI_Repast_Time is null");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeIsNotNull() {
            addCriterion("m.OCI_Repast_Time is not null");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeEqualTo(Date value) {
            addCriterion("m.OCI_Repast_Time =", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeNotEqualTo(Date value) {
            addCriterion("m.OCI_Repast_Time <>", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeGreaterThan(Date value) {
            addCriterion("m.OCI_Repast_Time >", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m.OCI_Repast_Time >=", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeLessThan(Date value) {
            addCriterion("m.OCI_Repast_Time <", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeLessThanOrEqualTo(Date value) {
            addCriterion("m.OCI_Repast_Time <=", value, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeIn(List<Date> values) {
            addCriterion("m.OCI_Repast_Time in", values, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeNotIn(List<Date> values) {
            addCriterion("m.OCI_Repast_Time not in", values, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeBetween(Date value1, Date value2) {
            addCriterion("m.OCI_Repast_Time between", value1, value2, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciRepastTimeNotBetween(Date value1, Date value2) {
            addCriterion("m.OCI_Repast_Time not between", value1, value2, "ociRepastTime");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountIsNull() {
            addCriterion("m.OCI_Consume_Amount is null");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountIsNotNull() {
            addCriterion("m.OCI_Consume_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount =", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount <>", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount >", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount >=", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountLessThan(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount <", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Consume_Amount <=", value, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Consume_Amount in", values, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Consume_Amount not in", values, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Consume_Amount between", value1, value2, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Consume_Amount not between", value1, value2, "ociConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountIsNull() {
            addCriterion("m.OCI_Discount is null");
            return (Criteria) this;
        }

        public Criteria andOciDiscountIsNotNull() {
            addCriterion("m.OCI_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andOciDiscountEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Discount =", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountNotEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Discount <>", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountGreaterThan(BigDecimal value) {
            addCriterion("m.OCI_Discount >", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Discount >=", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountLessThan(BigDecimal value) {
            addCriterion("m.OCI_Discount <", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Discount <=", value, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Discount in", values, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountNotIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Discount not in", values, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Discount between", value1, value2, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Discount not between", value1, value2, "ociDiscount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountIsNull() {
            addCriterion("m.OCI_Paid_Amount is null");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountIsNotNull() {
            addCriterion("m.OCI_Paid_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount =", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount <>", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount >", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount >=", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountLessThan(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount <", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.OCI_Paid_Amount <=", value, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Paid_Amount in", values, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("m.OCI_Paid_Amount not in", values, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Paid_Amount between", value1, value2, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.OCI_Paid_Amount not between", value1, value2, "ociPaidAmount");
            return (Criteria) this;
        }

        public Criteria andOciRemarkIsNull() {
            addCriterion("m.OCI_Remark is null");
            return (Criteria) this;
        }

        public Criteria andOciRemarkIsNotNull() {
            addCriterion("m.OCI_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andOciRemarkEqualTo(String value) {
            addCriterion("m.OCI_Remark =", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkNotEqualTo(String value) {
            addCriterion("m.OCI_Remark <>", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkGreaterThan(String value) {
            addCriterion("m.OCI_Remark >", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("m.OCI_Remark >=", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkLessThan(String value) {
            addCriterion("m.OCI_Remark <", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkLessThanOrEqualTo(String value) {
            addCriterion("m.OCI_Remark <=", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkLike(String value) {
            addCriterion("m.OCI_Remark like", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkNotLike(String value) {
            addCriterion("m.OCI_Remark not like", value, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkIn(List<String> values) {
            addCriterion("m.OCI_Remark in", values, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkNotIn(List<String> values) {
            addCriterion("m.OCI_Remark not in", values, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkBetween(String value1, String value2) {
            addCriterion("m.OCI_Remark between", value1, value2, "ociRemark");
            return (Criteria) this;
        }

        public Criteria andOciRemarkNotBetween(String value1, String value2) {
            addCriterion("m.OCI_Remark not between", value1, value2, "ociRemark");
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