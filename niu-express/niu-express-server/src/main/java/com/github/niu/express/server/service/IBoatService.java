package com.github.niu.express.server.service;

import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.dto.Page;
import com.github.niu.express.api.models.vo.BoatVO;
import com.github.niu.express.server.models.Boat;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IBoatService extends IService<Boat> {
   /**
    * 创建船
    * @param dto
    * @return
    * @throws Exception
    */
   int createBoat(BoatDTO dto) throws Exception;

   /**
    * 获取船次
    * @param dto
    * @return
    * @throws Exception
    */
   List<BoatVO> getByQueryDTO(BoatQueryDTO dto) throws Exception;

   /**
    *
    * @param userId
    * @return
    * @throws Exception
    */
   List<BoatVO> getByUserId(Long userId) throws Exception;
}
