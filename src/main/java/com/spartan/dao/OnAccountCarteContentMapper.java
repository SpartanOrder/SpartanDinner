package com.spartan.dao;

import com.spartan.model.OnAccountCarteContent;
import com.spartan.model.OnAccountCarteContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OnAccountCarteContentMapper extends BaseMapper<OnAccountCarteContent, Integer> {
    int countByExample(OnAccountCarteContentExample example);

    int deleteByExample(OnAccountCarteContentExample example);

    List<OnAccountCarteContent> selectByExample(OnAccountCarteContentExample example);

    int updateByExampleSelective(@Param("record") OnAccountCarteContent record, @Param("example") OnAccountCarteContentExample example);

    int updateByExample(@Param("record") OnAccountCarteContent record, @Param("example") OnAccountCarteContentExample example);
}