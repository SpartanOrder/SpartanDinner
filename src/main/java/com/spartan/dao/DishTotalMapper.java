package com.spartan.dao;

import com.spartan.model.DishTotal;
import com.spartan.model.DishTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishTotalMapper extends BaseMapper<DishTotal, Integer> {
    int countByExample(DishTotalExample example);

    int deleteByExample(DishTotalExample example);

    List<DishTotal> selectByExample(DishTotalExample example);

    int updateByExampleSelective(@Param("record") DishTotal record, @Param("example") DishTotalExample example);

    int updateByExample(@Param("record") DishTotal record, @Param("example") DishTotalExample example);
}