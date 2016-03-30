package com.spartan.dao;

import com.spartan.model.OnAccountCarteInfo;

import java.util.List;

public interface OnAccountCarteInfoMapper {
    int deleteByPrimaryKey(Integer eciId);

    int insert(OnAccountCarteInfo record);

    OnAccountCarteInfo selectByPrimaryKey(Integer eciId);

    List<OnAccountCarteInfo> selectAll();

    int updateByPrimaryKey(OnAccountCarteInfo record);
}