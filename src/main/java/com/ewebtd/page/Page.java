/**
 * Page.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-14 9:58
 */
package com.ewebtd.page;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-14 9:58
 **/
public class Page {
    private Integer pageNum;
    private Integer pageSize;
    private String orderByColumn;
    private String isAsc;

    public Page() {
    }

    public Page(Integer pageSize, String orderByColumn, String isAsc) {
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
        this.isAsc = isAsc;
    }

    public Page(Integer pageNum, Integer pageSize, String orderByColumn, String isAsc) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
        this.isAsc = isAsc;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
