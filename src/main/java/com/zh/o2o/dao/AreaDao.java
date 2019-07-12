package com.zh.o2o.dao;

import java.util.List;

import com.zh.o2o.entity.Area;

public interface AreaDao {
    /**
     * 列出区域列别
     * @return arrayList
     */
    List<Area> queryArea();

}
