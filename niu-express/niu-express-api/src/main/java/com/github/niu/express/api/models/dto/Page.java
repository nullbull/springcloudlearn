package com.github.niu.express.api.models.dto;


import lombok.Data;

import java.util.List;

/**
 * 分页
 */
@Data
public class Page<T> {

    private Integer pageSize;

    private Integer pageNo;

    private  Integer total;

    private List<T> records;


    /**
     * 获取总页数
     * @return 总页数
     */
    public int getTotalPage() {
        if (this.getPageSize() == 0) {
            return 0;
        } else {
            int pages = this.getTotal() / this.getPageSize();
            return pages;
        }
    }
}
