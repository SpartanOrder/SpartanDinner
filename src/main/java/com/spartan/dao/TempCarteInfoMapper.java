package com.spartan.dao;

import com.spartan.model.TempCarteInfo;

import java.util.List;

public interface TempCarteInfoMapper {
    int deleteByPrimaryKey(Integer tciid);

    int insert(TempCarteInfo record);

    TempCarteInfo selectByPrimaryKey(Integer tciid);

    List<TempCarteInfo> selectAll();

    int updateByPrimaryKey(TempCarteInfo record);
}