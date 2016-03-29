package com.spartan.dao;

import com.spartan.model.DishType;

import java.util.List;

public interface DishTypeMapper {
    int deleteByPrimaryKey(Byte dishtypeid);

    int insert(DishType record);

    DishType selectByPrimaryKey(Byte dishtypeid);

    List<DishType> selectAll();

    int updateByPrimaryKey(DishType record);
}