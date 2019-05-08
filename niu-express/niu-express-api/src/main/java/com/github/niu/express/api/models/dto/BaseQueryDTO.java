package com.github.niu.express.api.models.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/3 17:03
 * @desc
 */
@Data
public class BaseQueryDTO implements Serializable {

    private int DEFAULT_PAGE_NO = 0;

    private int DEFAULT_PAGE_SIZE = 10;
    private Integer pageSize;

    private Integer pageNo;

    /**
     * 检查pageNo 和 pageSize
     * 如果为null 或者 小于 等于0
     * 赋予 默认值
     */
    public void check() {
        this.pageNo = this.pageNo == null ? DEFAULT_PAGE_NO : (this.pageNo <= 0 ? DEFAULT_PAGE_NO : this.pageNo - 1);
        this.pageSize = this.pageSize == null ? DEFAULT_PAGE_SIZE : (this.pageSize <= 0 ? DEFAULT_PAGE_SIZE : this.pageSize);
        offset = pageNo * pageSize;
    }

    public Integer offset;


}
