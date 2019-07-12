package com.zh.o2o.service;

import com.zh.o2o.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {
    /**
     * 根据查询条件获取 ShopCategory列表
     * @param shopCategoryCondition
     * @return
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
