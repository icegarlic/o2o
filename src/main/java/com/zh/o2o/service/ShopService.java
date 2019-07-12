package com.zh.o2o.service;

import java.io.InputStream;

import com.zh.o2o.dto.ImageHolder;
import com.zh.o2o.dto.ShopExecution;
import com.zh.o2o.entity.Shop;
import com.zh.o2o.exceptions.ShopOperationException;

public interface ShopService {
    /**
     * 根据shopCondition 分页返回想应店铺列表
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
    /**
     * 通过店铺Id 获取店铺信息
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);
    /**
     * 更新店铺信息，包括图片的处理
     * @param shop
     * @param thumbnail
     * @return
     * @throws ShopOperationException
     */
    ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
    /**
     * 注册店铺信息，包括图片处理
     * @param shop
     * @param thumbnail
     * @return
     * @throws ShopOperationException
     */
    ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
