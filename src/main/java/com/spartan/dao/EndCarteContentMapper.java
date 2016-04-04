package com.spartan.dao;

import com.spartan.model.EndCarteContent;
import com.spartan.model.EndCarteContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EndCarteContentMapper extends BaseMapper<EndCarteContent, Integer> {
    int countByExample(EndCarteContentExample example);

    int deleteByExample(EndCarteContentExample example);

    List<EndCarteContent> selectByExample(EndCarteContentExample example);

    int updateByExampleSelective(@Param("record") EndCarteContent record, @Param("example") EndCarteContentExample example);

    int updateByExample(@Param("record") EndCarteContent record, @Param("example") EndCarteContentExample example);
}