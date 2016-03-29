package com.spartan.dao;

import com.spartan.model.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerid);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer customerid);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}