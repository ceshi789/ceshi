package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();

    Area queryAreById(int area);

    int insertArea(Area area);

    int updateArea(Area area);

    inr deleteArea(int areaId); 
}
