package com.spartan.dao;

import com.spartan.model.MemberType;
import com.spartan.model.MemberTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberTypeMapper extends BaseMapper<MemberType, Integer> {
    int countByExample(MemberTypeExample example);

    int deleteByExample(MemberTypeExample example);

    List<MemberType> selectByExample(MemberTypeExample example);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

}