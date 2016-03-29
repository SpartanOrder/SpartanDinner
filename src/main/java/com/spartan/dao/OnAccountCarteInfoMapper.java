package com.spartan.dao;

import com.spartan.model.OnAccountCarteInfo;

import java.util.List;

public interface OnAccountCarteInfoMapper {
    int deleteByPrimaryKey(Integer eciid);

    int insert(OnAccountCarteInfo record);

    OnAccountCarteInfo selectByPrimaryKey(Integer eciid);

    List<OnAccountCarteInfo> selectAll();

    int updateByPrimaryKey(OnAccountCarteInfo record);
}