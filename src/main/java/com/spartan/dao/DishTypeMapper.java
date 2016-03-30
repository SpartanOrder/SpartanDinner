package com.spartan.dao;

import com.spartan.model.DishType;

import java.util.List;

public interface DishTypeMapper {
    int deleteByPrimaryKey(Integer dishTypeId);

    int insert(DishType record);

    DishType selectByPrimaryKey(Integer dishTypeId);

    List<DishType> selectAll();

    int updateByPrimaryKey(DishType record);
}