package com.bupt.commons.dto;

import java.io.Serializable;
import java.util.List;

/**
 *  分页数据传输对象
 * @param <TbUser>
 */
public class PageInfo<TbUser> implements Serializable {

    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<TbUser> data;
    private String error;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<TbUser> getData() {
        return data;
    }

    public void setData(List<TbUser> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
