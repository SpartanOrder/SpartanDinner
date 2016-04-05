package com.spartan.service.impl;

import com.spartan.dao.BaseMapper;
import com.spartan.service.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/30 21:15
 */
public abstract class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {

    protected BaseMapper<T, ID> baseMapper;

    public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    public int insert(T t) {
        return baseMapper.insert(t);
    }

    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    public T selectByPrimaryKey(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

//    public List<T> selectAll() {
    //        return baseMapper.selectAll();
    //    }

    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }
}
