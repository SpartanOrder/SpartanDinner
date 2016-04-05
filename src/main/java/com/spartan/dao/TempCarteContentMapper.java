package com.spartan.dao;

import com.spartan.model.TempCarteContent;
import com.spartan.model.TempCarteContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TempCarteContentMapper extends BaseMapper<TempCarteContent, Integer> {
    int countByExample(TempCarteContentExample example);

    int deleteByExample(TempCarteContentExample example);

    List<TempCarteContent> selectByExample(TempCarteContentExample example);

    int updateByExampleSelective(@Param("record") TempCarteContent record, @Param("example") TempCarteContentExample example);

    int updateByExample(@Param("record") TempCarteContent record, @Param("example") TempCarteContentExample example);

}