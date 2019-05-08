package com.github.niu.express.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.dto.Page;
import com.github.niu.express.api.models.vo.BoatVO;
import com.github.niu.express.server.models.Boat;
import com.github.niu.express.server.mapper.BoatMapper;
import com.github.niu.express.server.service.IBoatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
        if (null == dto.getId()) {
            Boat boat = new Boat();
            boat = dto.apply(boat);
            boat.setId(SnowFlowerUtils.createId());
            boat.setCreateAt(new Date());
            boat.setStatus(Constants.BOAT_STATUS_NEW);
            return baseMapper.insert(boat);
        } else {
            Boat temp = getById(dto.getId());
            ParameterAssert.isBoatValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            temp = dto.apply(temp);
            temp.setUpdateAt(new Date());
            return baseMapper.updateById(temp);
        }

    }

    @Override
    public List<BoatVO> getByQueryDTO(BoatQueryDTO dto) throws Exception {
        dto.check();
        return baseMapper.selectByQueryDTO(dto);
    }

    @Override
    public List<BoatVO> getByUserId(@NotNull Long userId) throws Exception {
        return baseMapper.selectList(new QueryWrapper<Boat>().lambda().eq(Boat::getDriverId, userId)).stream().map(
            b -> {
                BoatVO boatVO = new BoatVO();
                try {
                    return b.apply(boatVO);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }).collect(Collectors.toList());
    }


}
