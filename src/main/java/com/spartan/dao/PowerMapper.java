package com.spartan.dao;

import com.spartan.model.Power;
import com.spartan.model.PowerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PowerMapper extends BaseMapper<Power, Integer> {
    int countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    List<Power> selectByExample(PowerExample example);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

}