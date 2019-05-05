package com.github.niu.express.server.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
@Data
public class DormitoryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Byte id;

    /**
     * 1A2B3C
     */
    private Byte part;

    private String name;

    private String content;

}
