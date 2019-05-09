package com.github.niu.user.server.models;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-05
 */
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Long userId;

    private String leaveName;

    private String leavePhone;

    private Byte locationId;

    private Byte status;

    private String locationName;

    private String detail;

}
