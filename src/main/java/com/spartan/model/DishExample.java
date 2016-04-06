package com.spartan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishExample() {
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

        public Criteria andDishIdIsNull() {
            addCriterion("m.dish_ID is null");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNotNull() {
            addCriterion("m.dish_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDishIdEqualTo(Integer value) {
            addCriterion("m.dish_ID =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(Integer value) {
            addCriterion("m.dish_ID <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(Integer value) {
            addCriterion("m.dish_ID >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.dish_ID >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(Integer value) {
            addCriterion("m.dish_ID <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.dish_ID <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<Integer> values) {
            addCriterion("m.dish_ID in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<Integer> values) {
            addCriterion("m.dish_ID not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_ID between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.dish_ID not between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdIsNull() {
            addCriterion("m.ddish_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdIsNotNull() {
            addCriterion("m.ddish_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdEqualTo(Integer value) {
            addCriterion("m.ddish_Type_ID =", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdNotEqualTo(Integer value) {
            addCriterion("m.ddish_Type_ID <>", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdGreaterThan(Integer value) {
            addCriterion("m.ddish_Type_ID >", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m.ddish_Type_ID >=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdLessThan(Integer value) {
            addCriterion("m.ddish_Type_ID <", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("m.ddish_Type_ID <=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdIn(List<Integer> values) {
            addCriterion("m.ddish_Type_ID in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdNotIn(List<Integer> values) {
            addCriterion("m.ddish_Type_ID not in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("m.ddish_Type_ID between", value1, value2, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDDishTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m.ddish_Type_ID not between", value1, value2, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNull() {
            addCriterion("m.dish_Name is null");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNotNull() {
            addCriterion("m.dish_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDishNameEqualTo(String value) {
            addCriterion("m.dish_Name =", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotEqualTo(String value) {
            addCriterion("m.dish_Name <>", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThan(String value) {
            addCriterion("m.dish_Name >", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Name >=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThan(String value) {
            addCriterion("m.dish_Name <", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Name <=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLike(String value) {
            addCriterion("m.dish_Name like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotLike(String value) {
            addCriterion("m.dish_Name not like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameIn(List<String> values) {
            addCriterion("m.dish_Name in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotIn(List<String> values) {
            addCriterion("m.dish_Name not in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameBetween(String value1, String value2) {
            addCriterion("m.dish_Name between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotBetween(String value1, String value2) {
            addCriterion("m.dish_Name not between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishSpeelIsNull() {
            addCriterion("m.dish_Speel is null");
            return (Criteria) this;
        }

        public Criteria andDishSpeelIsNotNull() {
            addCriterion("m.dish_Speel is not null");
            return (Criteria) this;
        }

        public Criteria andDishSpeelEqualTo(String value) {
            addCriterion("m.dish_Speel =", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelNotEqualTo(String value) {
            addCriterion("m.dish_Speel <>", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelGreaterThan(String value) {
            addCriterion("m.dish_Speel >", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Speel >=", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelLessThan(String value) {
            addCriterion("m.dish_Speel <", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Speel <=", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelLike(String value) {
            addCriterion("m.dish_Speel like", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelNotLike(String value) {
            addCriterion("m.dish_Speel not like", value, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelIn(List<String> values) {
            addCriterion("m.dish_Speel in", values, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelNotIn(List<String> values) {
            addCriterion("m.dish_Speel not in", values, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelBetween(String value1, String value2) {
            addCriterion("m.dish_Speel between", value1, value2, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishSpeelNotBetween(String value1, String value2) {
            addCriterion("m.dish_Speel not between", value1, value2, "dishSpeel");
            return (Criteria) this;
        }

        public Criteria andDishCostIsNull() {
            addCriterion("m.dish_Cost is null");
            return (Criteria) this;
        }

        public Criteria andDishCostIsNotNull() {
            addCriterion("m.dish_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andDishCostEqualTo(BigDecimal value) {
            addCriterion("m.dish_Cost =", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostNotEqualTo(BigDecimal value) {
            addCriterion("m.dish_Cost <>", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostGreaterThan(BigDecimal value) {
            addCriterion("m.dish_Cost >", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.dish_Cost >=", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostLessThan(BigDecimal value) {
            addCriterion("m.dish_Cost <", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.dish_Cost <=", value, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostIn(List<BigDecimal> values) {
            addCriterion("m.dish_Cost in", values, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostNotIn(List<BigDecimal> values) {
            addCriterion("m.dish_Cost not in", values, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.dish_Cost between", value1, value2, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.dish_Cost not between", value1, value2, "dishCost");
            return (Criteria) this;
        }

        public Criteria andDishUnitIsNull() {
            addCriterion("m.dish_Unit is null");
            return (Criteria) this;
        }

        public Criteria andDishUnitIsNotNull() {
            addCriterion("m.dish_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andDishUnitEqualTo(String value) {
            addCriterion("m.dish_Unit =", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitNotEqualTo(String value) {
            addCriterion("m.dish_Unit <>", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitGreaterThan(String value) {
            addCriterion("m.dish_Unit >", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Unit >=", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitLessThan(String value) {
            addCriterion("m.dish_Unit <", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Unit <=", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitLike(String value) {
            addCriterion("m.dish_Unit like", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitNotLike(String value) {
            addCriterion("m.dish_Unit not like", value, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitIn(List<String> values) {
            addCriterion("m.dish_Unit in", values, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitNotIn(List<String> values) {
            addCriterion("m.dish_Unit not in", values, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitBetween(String value1, String value2) {
            addCriterion("m.dish_Unit between", value1, value2, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishUnitNotBetween(String value1, String value2) {
            addCriterion("m.dish_Unit not between", value1, value2, "dishUnit");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNull() {
            addCriterion("m.dish_Price is null");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNotNull() {
            addCriterion("m.dish_Price is not null");
            return (Criteria) this;
        }

        public Criteria andDishPriceEqualTo(BigDecimal value) {
            addCriterion("m.dish_Price =", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotEqualTo(BigDecimal value) {
            addCriterion("m.dish_Price <>", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThan(BigDecimal value) {
            addCriterion("m.dish_Price >", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m.dish_Price >=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThan(BigDecimal value) {
            addCriterion("m.dish_Price <", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m.dish_Price <=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceIn(List<BigDecimal> values) {
            addCriterion("m.dish_Price in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotIn(List<BigDecimal> values) {
            addCriterion("m.dish_Price not in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.dish_Price between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m.dish_Price not between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionIsNull() {
            addCriterion("m.dish_Description is null");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionIsNotNull() {
            addCriterion("m.dish_Description is not null");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionEqualTo(String value) {
            addCriterion("m.dish_Description =", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionNotEqualTo(String value) {
            addCriterion("m.dish_Description <>", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionGreaterThan(String value) {
            addCriterion("m.dish_Description >", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Description >=", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionLessThan(String value) {
            addCriterion("m.dish_Description <", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Description <=", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionLike(String value) {
            addCriterion("m.dish_Description like", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionNotLike(String value) {
            addCriterion("m.dish_Description not like", value, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionIn(List<String> values) {
            addCriterion("m.dish_Description in", values, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionNotIn(List<String> values) {
            addCriterion("m.dish_Description not in", values, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionBetween(String value1, String value2) {
            addCriterion("m.dish_Description between", value1, value2, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishDescriptionNotBetween(String value1, String value2) {
            addCriterion("m.dish_Description not between", value1, value2, "dishDescription");
            return (Criteria) this;
        }

        public Criteria andDishCookingIsNull() {
            addCriterion("m.dish_Cooking is null");
            return (Criteria) this;
        }

        public Criteria andDishCookingIsNotNull() {
            addCriterion("m.dish_Cooking is not null");
            return (Criteria) this;
        }

        public Criteria andDishCookingEqualTo(String value) {
            addCriterion("m.dish_Cooking =", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingNotEqualTo(String value) {
            addCriterion("m.dish_Cooking <>", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingGreaterThan(String value) {
            addCriterion("m.dish_Cooking >", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Cooking >=", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingLessThan(String value) {
            addCriterion("m.dish_Cooking <", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Cooking <=", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingLike(String value) {
            addCriterion("m.dish_Cooking like", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingNotLike(String value) {
            addCriterion("m.dish_Cooking not like", value, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingIn(List<String> values) {
            addCriterion("m.dish_Cooking in", values, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingNotIn(List<String> values) {
            addCriterion("m.dish_Cooking not in", values, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingBetween(String value1, String value2) {
            addCriterion("m.dish_Cooking between", value1, value2, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishCookingNotBetween(String value1, String value2) {
            addCriterion("m.dish_Cooking not between", value1, value2, "dishCooking");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlIsNull() {
            addCriterion("m.dish_Img_Url is null");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlIsNotNull() {
            addCriterion("m.dish_Img_Url is not null");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlEqualTo(String value) {
            addCriterion("m.dish_Img_Url =", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlNotEqualTo(String value) {
            addCriterion("m.dish_Img_Url <>", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlGreaterThan(String value) {
            addCriterion("m.dish_Img_Url >", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("m.dish_Img_Url >=", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlLessThan(String value) {
            addCriterion("m.dish_Img_Url <", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlLessThanOrEqualTo(String value) {
            addCriterion("m.dish_Img_Url <=", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlLike(String value) {
            addCriterion("m.dish_Img_Url like", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlNotLike(String value) {
            addCriterion("m.dish_Img_Url not like", value, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlIn(List<String> values) {
            addCriterion("m.dish_Img_Url in", values, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlNotIn(List<String> values) {
            addCriterion("m.dish_Img_Url not in", values, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlBetween(String value1, String value2) {
            addCriterion("m.dish_Img_Url between", value1, value2, "dishImgUrl");
            return (Criteria) this;
        }

        public Criteria andDishImgUrlNotBetween(String value1, String value2) {
            addCriterion("m.dish_Img_Url not between", value1, value2, "dishImgUrl");
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