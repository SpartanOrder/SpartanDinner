package com.spartan.dao;

import com.spartan.model.Customer;
import com.spartan.model.CustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper extends BaseMapper<Customer, Integer> {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    List<Customer> selectByExample(CustomerExample example);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

}