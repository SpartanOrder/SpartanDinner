package com.spartan.dao;

import com.spartan.model.Restaurant;

import java.util.List;

public interface RestaurantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Restaurant record);

    Restaurant selectByPrimaryKey(Integer id);

    List<Restaurant> selectAll();

    int updateByPrimaryKey(Restaurant record);
}