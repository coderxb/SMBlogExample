/**
 * Page.java   2016年9月18日 下午6:26:12 by LIXUEBING 
 *
 * Copyright (c) 2010 - 2016 xuebing.Li. All rights reserved.
 * 
 */
package indi.xuebing.example.utils;

import java.util.List;

public class Page<T> {

    //当前页号
    private Integer pageNo = 1;
    //总记录数
    private Integer totalRecords = 0;
    //总页数
    private Integer totalPages = 0;
    //每页记录数
    private Integer pageSize = 5;
    //数据信息
    private List<T> dataList = null;

    public Page() {
    }

    public Page(Integer pageNo, Integer totalRecords) {
        this.setPageNo(pageNo);
        this.setTotalRecords(totalRecords);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if (pageNo == null || pageNo <= 1) {
            this.pageNo = 1;
        }
        this.pageNo = pageNo;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        if (totalRecords <= 0) {
            this.totalRecords = 0;
            this.totalPages = 0;
            return;
        }
        if (totalRecords % this.pageSize == 0) {
            this.totalPages = totalRecords / this.pageSize;
        } else {
            this.totalPages = totalRecords / this.pageSize + 1;
        }
        this.totalRecords = totalRecords;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

}
