package com.github.niu.express.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.server.models.Boat;
import com.github.niu.express.server.mapper.BoatMapper;
import com.github.niu.express.server.service.IBoatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Service
public class BoatServiceImpl extends ServiceImpl<BoatMapper, Boat> implements IBoatService {

    @Override
    public int createBoat(BoatDTO dto) throws Exception {
        Boat boat = new Boat();
        boat = dto.apply(boat);
        if (null == dto.getId()) {
            boat.setId(SnowFlowerUtils.createId());
            boat.setCreateAt(new Date());
            boat.setStatus(Constants.BOAT_STATUS_NEW);
            return baseMapper.insert(boat);
        }
        return 0;
    }


}
