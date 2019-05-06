package com.github.niu.user.server.models;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Data
public class AppUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nickname;

    private Byte gender;

    private String avatarUrl;

    private String phone;

    private String content;

    private Integer point;

    private String openid;

    private Date lastLogin;

    private String loginIp;

    private Date createAt;

    private Date updateAt;

    private Byte type;
}
