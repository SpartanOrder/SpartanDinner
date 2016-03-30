package com.spartan.dao;

import com.spartan.model.TempCarteInfo;

import java.util.List;

public interface TempCarteInfoMapper {
    int deleteByPrimaryKey(Integer tciId);

    int insert(TempCarteInfo record);

    TempCarteInfo selectByPrimaryKey(Integer tciId);

    List<TempCarteInfo> selectAll();

    int updateByPrimaryKey(TempCarteInfo record);
}