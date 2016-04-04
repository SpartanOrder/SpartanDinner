package com.spartan.dao;

import com.spartan.model.EmployeeInfo;
import com.spartan.model.EmployeeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeInfoMapper extends BaseMapper<EmployeeInfo, Integer> {
    int countByExample(EmployeeInfoExample example);

    int deleteByExample(EmployeeInfoExample example);

    List<EmployeeInfo> selectByExample(EmployeeInfoExample example);

    int updateByExampleSelective(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByExample(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

}