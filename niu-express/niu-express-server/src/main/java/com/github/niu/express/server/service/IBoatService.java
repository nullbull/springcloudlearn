package com.github.niu.express.server.service;

import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.server.models.Boat;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IBoatService extends IService<Boat> {
   int createBoat(BoatDTO dto) throws Exception;
}
