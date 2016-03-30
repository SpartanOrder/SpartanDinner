package com.spartan.dao;

import com.spartan.model.Region;

import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(Integer regionId);

    int insert(Region record);

    Region selectByPrimaryKey(Integer regionId);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);
}