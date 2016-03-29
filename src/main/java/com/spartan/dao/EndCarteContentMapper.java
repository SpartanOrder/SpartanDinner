package com.spartan.dao;

import com.spartan.model.EndCarteContent;

import java.util.List;

public interface EndCarteContentMapper {
    int deleteByPrimaryKey(Integer eccid);

    int insert(EndCarteContent record);

    EndCarteContent selectByPrimaryKey(Integer eccid);

    List<EndCarteContent> selectAll();

    int updateByPrimaryKey(EndCarteContent record);
}