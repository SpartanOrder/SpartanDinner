package com.spartan.dao;

import com.spartan.model.Region;

import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(Byte regionid);

    int insert(Region record);

    Region selectByPrimaryKey(Byte regionid);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);
}