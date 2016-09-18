/**
 * QueryBlog.java   2016年9月18日 下午7:01:06 by LIXUEBING 
 *
 * Copyright (c) 2010 - 2016 xuebing.Li. All rights reserved.
 * 
 */
package indi.xuebing.example.action.domain;

public class QueryBlog {

    private Integer pageNo = 1;
    private Integer pageSize = 5;
    private Integer offset = 0;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        if (pageSize <= 0) {
            return 0;
        }
        return pageSize;
    }

    public Integer getOffset() {
        if (this.pageNo == null || this.pageNo <= 0) {
            this.offset = 0;
            return 0;
        }
        this.offset = (this.pageNo - 1) * this.pageSize;
        return this.offset;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
