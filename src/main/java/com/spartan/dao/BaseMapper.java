package com.spartan.dao;

import com.spartan.model.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Wind on 2016/3/30.
 */
public interface BaseMapper<T, ID extends Serializable> {
    int deleteByPrimaryKey(ID id);

    int insert(T t);

    //    int insertSelective(T t);

    T selectByPrimaryKey(ID id);

    List<T> selectAll();

    //    int updateByPrimaryKeySelective(T t);

    //    int updateByPrimaryKeyWithBLOBs(T t);

    int updateByPrimaryKey(T t);

}
