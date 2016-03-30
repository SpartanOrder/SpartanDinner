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

    private BaseMapper<T, ID> baseMapper;

    public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    //    @Override
    //    public int insertSelective(T record) {
    //        return baseMapper.insertSelective(record);
    //    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectAll() {
        return (List<T>) baseMapper.selectAll();
    }

    //    @Override
    //    public int updateByPrimaryKeySelective(T record) {
    //        return baseMapper.updateByPrimaryKey(record);
    //    }

    //    @Override
    //    public int updateByPrimaryKeyWithBLOBs(T record) {
    //        return baseMapper.updateByPrimaryKeyWithBLOBs(record);
    //    }

    @Override
    public int updateByPrimaryKey(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(T record) {
        return baseMapper.insert(record);
    }


}
