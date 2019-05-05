package com.github.niu.user.server.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Data
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String realname;

    private String idNumber;

    private String schoolId;

    private String locationMessage;

    private String picture;

    private Byte status;

    private Date createAt;
}
