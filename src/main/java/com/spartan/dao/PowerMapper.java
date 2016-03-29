package com.spartan.dao;

import com.spartan.model.Power;

import java.util.List;

public interface PowerMapper {
    int deleteByPrimaryKey(Byte powerid);

    int insert(Power record);

    Power selectByPrimaryKey(Byte powerid);

    List<Power> selectAll();

    int updateByPrimaryKey(Power record);
}