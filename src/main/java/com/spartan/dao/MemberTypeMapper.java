package com.spartan.dao;

import com.spartan.model.MemberType;

import java.util.List;

public interface MemberTypeMapper {
    int deleteByPrimaryKey(Integer memtypeid);

    int insert(MemberType record);

    MemberType selectByPrimaryKey(Integer memtypeid);

    List<MemberType> selectAll();

    int updateByPrimaryKey(MemberType record);
}