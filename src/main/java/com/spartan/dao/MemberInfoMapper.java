package com.spartan.dao;

import com.spartan.model.MemberInfo;
import com.spartan.model.MemberInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberInfoMapper extends BaseMapper<MemberInfo, Integer> {
    int countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);
}