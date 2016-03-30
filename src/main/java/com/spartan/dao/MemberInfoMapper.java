package com.spartan.dao;

import com.spartan.model.MemberInfo;

import java.util.List;

public interface MemberInfoMapper {
    int deleteByPrimaryKey(Integer memId);

    int insert(MemberInfo record);

    MemberInfo selectByPrimaryKey(Integer memId);

    List<MemberInfo> selectAll();

    int updateByPrimaryKey(MemberInfo record);
}