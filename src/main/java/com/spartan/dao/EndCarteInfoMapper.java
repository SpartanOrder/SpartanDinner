package com.spartan.dao;

import com.spartan.model.EndCarteInfo;

import java.util.List;

public interface EndCarteInfoMapper {
    int deleteByPrimaryKey(Integer eciId);

    int insert(EndCarteInfo record);

    EndCarteInfo selectByPrimaryKey(Integer eciId);

    List<EndCarteInfo> selectAll();

    int updateByPrimaryKey(EndCarteInfo record);
}