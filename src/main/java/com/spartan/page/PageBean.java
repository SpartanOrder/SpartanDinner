package com.spartan.page;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/31 16:36
 */
public class PageBean<T> implements Serializable {
    private long total;//总记录数
    private List<T> list;//结果集
    private int pageNum;//第几页
    private int pageSize;//每页记录数
    private int pages;//总页数
    private int size;//当前页的数量，<=pageSize，该属性来自ArrayList的size属性
    private String orderBy;//排列的字符串
    private Boolean pageSizeZero;//如果pageSize=0或者RowBounds.limit=0会查询出全部的结果

    public PageBean(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.list = page;
            this.size = page.size();
            this.orderBy = page.getOrderBy();
            this.pageSizeZero = page.getPageSizeZero();
        }
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    public Boolean getPageSizeZero() {
        return pageSizeZero;
    }

    public void setPageSizeZero(Boolean pageSizeZero) {
        this.pageSizeZero = pageSizeZero;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", list=" + list +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pages=" + pages +
                ", size=" + size +
                ", orderBy='" + orderBy + '\'' +
                ", pageSizeZero=" + pageSizeZero +
                '}';
    }
}
