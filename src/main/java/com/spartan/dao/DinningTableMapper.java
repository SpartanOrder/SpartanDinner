package com.spartan.dao;

import com.spartan.model.DinningTable;

import java.util.List;

public interface DinningTableMapper {
    int deleteByPrimaryKey(Integer dtableid);

    int insert(DinningTable record);

    DinningTable selectByPrimaryKey(Integer dtableid);

    List<DinningTable> selectAll();

    int updateByPrimaryKey(DinningTable record);
}