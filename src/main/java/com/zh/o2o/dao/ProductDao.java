package com.zh.o2o.dao;

import com.zh.o2o.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    /**
     * 查询商品列表分页，可输入的条件有：商品名（模糊），商品状态，店铺Id，商品类别
     * @param productCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex,
                                   @Param("pageSize") int pageSize);

    /**
     * 查询对应商品的总数
     * @param productCondition
     * @return
     */
    int queryProductCount(@Param("productCondition") Product productCondition);

    /**
     * 通过productId查询唯一的商品信息
     * @param productId
     * @return
     */
    Product queryProductById(long productId);

    /**
     * 插入商品
     * @param product
     * @return
     */
    int insertProduct(Product product);

    /**
     * 更新商品信息
     * @param product
     * @return
     */
    int updateProduct(Product product);

    /**
     * 删除商品类别之前，将商品类别Id 置为空
     * @param productCategoryId
     * @return
     */
    int updateProductCategoryIdToNull(long productCategoryId);

    /**
     * 删除商品
     *
     * @param productId
     * @return
     */
    int deleteProduct(@Param("productId") long productId,
                      @Param("shopId") long shopId);
}
