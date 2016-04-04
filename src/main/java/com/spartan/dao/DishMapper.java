package com.spartan.dao;

import com.spartan.model.Dish;
import com.spartan.model.DishExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishMapper extends BaseMapper<Dish, Integer> {
    int countByExample(DishExample example);

    int deleteByExample(DishExample example);

    List<Dish> selectByExample(DishExample example);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

}