package com.zh.o2o.entity;

import java.util.Date;

/**
 * 图片详情
 * @version 2019年6月16日 下午12:52:33
 * @author zh
 *
 */
public class ProductImg {

    private Long productImgId;

    private String ingAddr;

    private String imgDesc;

    private Integer priority;

    private Date createTime;

    private Long productId;

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public String getImgAddr() {
        return ingAddr;
    }

    public void setImgAddr(String ingAddr) {
        this.ingAddr = ingAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}