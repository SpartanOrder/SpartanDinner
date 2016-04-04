package com.spartan.dao;

import com.spartan.model.EndCarteInfo;
import com.spartan.model.EndCarteInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EndCarteInfoMapper extends BaseMapper<EndCarteInfo, Integer> {
    int countByExample(EndCarteInfoExample example);

    int deleteByExample(EndCarteInfoExample example);

    List<EndCarteInfo> selectByExample(EndCarteInfoExample example);

    int updateByExampleSelective(@Param("record") EndCarteInfo record, @Param("example") EndCarteInfoExample example);

    int updateByExample(@Param("record") EndCarteInfo record, @Param("example") EndCarteInfoExample example);

}