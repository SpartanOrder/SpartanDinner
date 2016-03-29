package com.spartan.dao;

import com.spartan.model.Dish;

import java.util.List;

public interface DishMapper {
    int deleteByPrimaryKey(Integer dishid);

    int insert(Dish record);

    Dish selectByPrimaryKey(Integer dishid);

    List<Dish> selectAll();

    int updateByPrimaryKey(Dish record);
}