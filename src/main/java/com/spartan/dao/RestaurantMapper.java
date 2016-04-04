package com.spartan.dao;

import com.spartan.model.Restaurant;
import com.spartan.model.RestaurantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RestaurantMapper extends BaseMapper<Restaurant, Integer> {
    int countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    List<Restaurant> selectByExample(RestaurantExample example);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

}