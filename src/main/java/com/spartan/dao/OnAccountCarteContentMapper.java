package com.spartan.dao;

import com.spartan.model.OnAccountCarteContent;

import java.util.List;

public interface OnAccountCarteContentMapper {
    int deleteByPrimaryKey(Integer eccid);

    int insert(OnAccountCarteContent record);

    OnAccountCarteContent selectByPrimaryKey(Integer eccid);

    List<OnAccountCarteContent> selectAll();

    int updateByPrimaryKey(OnAccountCarteContent record);
}