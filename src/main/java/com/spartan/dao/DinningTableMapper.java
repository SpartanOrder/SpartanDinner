package com.spartan.dao;

import com.spartan.model.DinningTable;
import com.spartan.model.DinningTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DinningTableMapper extends BaseMapper<DinningTable, Integer> {
    int countByExample(DinningTableExample example);

    int deleteByExample(DinningTableExample example);

    List<DinningTable> selectByExample(DinningTableExample example);

    int updateByExampleSelective(@Param("record") DinningTable record, @Param("example") DinningTableExample example);

    int updateByExample(@Param("record") DinningTable record, @Param("example") DinningTableExample example);

}