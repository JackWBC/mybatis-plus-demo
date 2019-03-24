package com.baicheng.mybatisplusdemo.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 21:45
 */
public class MyPage<T> implements IPage<T> {
    private static final long serialVersionUID = -3531357913478424734L;

    /**
     * 分页记录列表
     */
    private List<T> records;
    /**
     * 总行数
     */
    private long total;
    /**
     * 每页记录数
     */
    private long size;
    /**
     * 当前页
     */
    private long current;

    @Override
    public List<T> getRecords() {
        return records;
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public IPage<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public IPage<T> setSize(long size) {
        this.size = size;
        return this;
    }

    @Override
    public long getCurrent() {
        return current;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        this.current = current;
        return this;
    }
}
