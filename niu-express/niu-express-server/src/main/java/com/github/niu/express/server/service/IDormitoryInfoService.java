package com.github.niu.express.server.service;

import com.github.niu.express.server.models.DormitoryInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
public interface IDormitoryInfoService extends IService<DormitoryInfo> {
    List<DormitoryInfo> getByDepartId(Byte id) throws Exception;

    DormitoryInfo getById(Byte id) throws Exception;

    DormitoryInfo getByName(String name) throws Exception;

}
