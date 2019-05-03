package com.github.niu.express.server.models;

import lombok.Data;

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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private String leaveName;

    private String leavePhone;

    private Byte locationId;

    private String locationName;

    private Byte status;


}
