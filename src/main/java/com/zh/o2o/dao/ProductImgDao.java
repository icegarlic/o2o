package com.zh.o2o.dao;

import com.zh.o2o.entity.ProductImg;

import java.util.List;

public interface ProductImgDao {
    /**
     * 查询商品图片
     * @param productId
     * @return
     */
    List<ProductImg> queryProductImgList(long productId);

    /**
     * 批量添加商品详情图片
     * @param productImgList
     * @return
     */
    int batchInsertProductImg(List<ProductImg> productImgList);

    /**
     * 根据商品Id 删除图片
     * @param productId
     * @return
     */
    int deleteProductImgByProductId(long productId);
}
