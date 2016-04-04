package com.spartan.dao;

import com.spartan.model.TempCarteInfo;
import com.spartan.model.TempCarteInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TempCarteInfoMapper extends BaseMapper<TempCarteInfo, Integer> {
    int countByExample(TempCarteInfoExample example);

    int deleteByExample(TempCarteInfoExample example);

    List<TempCarteInfo> selectByExample(TempCarteInfoExample example);

    int updateByExampleSelective(@Param("record") TempCarteInfo record, @Param("example") TempCarteInfoExample example);

    int updateByExample(@Param("record") TempCarteInfo record, @Param("example") TempCarteInfoExample example);

}