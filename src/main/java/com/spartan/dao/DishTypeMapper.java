package com.spartan.dao;

import com.spartan.model.DishType;
import com.spartan.model.DishTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishTypeMapper extends BaseMapper<DishType, Integer> {
    int countByExample(DishTypeExample example);

    int deleteByExample(DishTypeExample example);

    List<DishType> selectByExample(DishTypeExample example);

    int updateByExampleSelective(@Param("record") DishType record, @Param("example") DishTypeExample example);

    int updateByExample(@Param("record") DishType record, @Param("example") DishTypeExample example);

}