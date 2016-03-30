package com.spartan.dao;

import com.spartan.model.EndCarteContent;

import java.util.List;

public interface EndCarteContentMapper {
    int deleteByPrimaryKey(Integer eccId);

    int insert(EndCarteContent record);

    EndCarteContent selectByPrimaryKey(Integer eccId);

    List<EndCarteContent> selectAll();

    int updateByPrimaryKey(EndCarteContent record);
}