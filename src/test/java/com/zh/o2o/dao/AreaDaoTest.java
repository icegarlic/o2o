package com.zh.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zh.o2o.BaseTest;
import com.zh.o2o.entity.Area;

/**
 *
 * @version 2019年6月16日 下午4:00:58
 * @author zh
 *
 */
public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }
}
