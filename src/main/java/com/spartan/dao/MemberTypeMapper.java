package com.spartan.dao;

import com.spartan.model.MemberType;

import java.util.List;

public interface MemberTypeMapper {
    int deleteByPrimaryKey(Integer memTypeId);

    int insert(MemberType record);

    MemberType selectByPrimaryKey(Integer memTypeId);

    List<MemberType> selectAll();

    int updateByPrimaryKey(MemberType record);
}