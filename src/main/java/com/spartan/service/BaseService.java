package com.spartan.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Wind on 2016/3/30.
 */
public interface BaseService<T, ID extends Serializable> {
    void setBaseMapper();

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    //    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    List<T> selectAll();

    //    int updateByPrimaryKeySelective(T record);

    //    int updateByPrimaryKeyWithBLOBs(T record);

    int updateByPrimaryKey(T record);
}
