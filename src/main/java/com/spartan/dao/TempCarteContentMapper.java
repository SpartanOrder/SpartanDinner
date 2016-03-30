package com.spartan.dao;

import com.spartan.model.TempCarteContent;

import java.util.List;

public interface TempCarteContentMapper {
    int deleteByPrimaryKey(Integer tccId);

    int insert(TempCarteContent record);

    TempCarteContent selectByPrimaryKey(Integer tccId);

    List<TempCarteContent> selectAll();

    int updateByPrimaryKey(TempCarteContent record);
}