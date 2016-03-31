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

    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    //    public int insertSelective(T record) {
    //        return baseMapper.insertSelective(record);
    //    }

    public T selectByPrimaryKey(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    public List<T> selectAll() {
        return (List<T>) baseMapper.selectAll();
    }

    //    public int updateByPrimaryKeySelective(T record) {
    //        return baseMapper.updateByPrimaryKey(record);
    //    }

    //    public int updateByPrimaryKeyWithBLOBs(T record) {
    //        return baseMapper.updateByPrimaryKeyWithBLOBs(record);
    //    }

    public int updateByPrimaryKey(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    public int insert(T record) {
        return baseMapper.insert(record);
    }


}
