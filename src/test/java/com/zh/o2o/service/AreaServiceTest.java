package com.zh.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zh.o2o.BaseTest;
import com.zh.o2o.entity.Area;

/**
 *
 * @version 2019年6月16日 下午4:52:18
 * @author zh
 *
 */
public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑", areaList.get(0).getAreaName());
    }
}
