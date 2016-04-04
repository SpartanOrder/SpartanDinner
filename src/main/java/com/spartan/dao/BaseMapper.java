package com.spartan.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Wind on 2016/3/30.
 */
public interface BaseMapper<T, ID extends Serializable> {
    int deleteByPrimaryKey(ID id);//按主键删除

    int insert(T t);//全部插入

    int insertSelective(T t);//部分插入

    T selectByPrimaryKey(ID id);//按主键查询

    List<T> selectAll();//查找所有

    int updateByPrimaryKeySelective(T t);//按主键部分更新

    int updateByPrimaryKey(T t);//按主键全部更新
}
