package com.spartan.dao;

import com.spartan.model.AmountTotal;
import com.spartan.model.AmountTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmountTotalMapper extends BaseMapper<AmountTotal, Integer> {
    int countByExample(AmountTotalExample example);

    int deleteByExample(AmountTotalExample example);

    List<AmountTotal> selectByExample(AmountTotalExample example);

    int updateByExampleSelective(@Param("record") AmountTotal record, @Param("example") AmountTotalExample example);

    int updateByExample(@Param("record") AmountTotal record, @Param("example") AmountTotalExample example);

}