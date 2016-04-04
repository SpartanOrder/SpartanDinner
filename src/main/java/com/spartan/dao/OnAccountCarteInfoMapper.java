package com.spartan.dao;

import com.spartan.model.OnAccountCarteInfo;
import com.spartan.model.OnAccountCarteInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OnAccountCarteInfoMapper extends BaseMapper<OnAccountCarteInfo, Integer> {
    int countByExample(OnAccountCarteInfoExample example);

    int deleteByExample(OnAccountCarteInfoExample example);

    List<OnAccountCarteInfo> selectByExample(OnAccountCarteInfoExample example);

    int updateByExampleSelective(@Param("record") OnAccountCarteInfo record, @Param("example") OnAccountCarteInfoExample example);

    int updateByExample(@Param("record") OnAccountCarteInfo record, @Param("example") OnAccountCarteInfoExample example);

}