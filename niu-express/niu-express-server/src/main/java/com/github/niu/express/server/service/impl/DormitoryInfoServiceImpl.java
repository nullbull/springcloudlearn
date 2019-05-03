package com.github.niu.express.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.niu.express.server.models.DormitoryInfo;
import com.github.niu.express.server.mapper.DormitoryInfoMapper;
import com.github.niu.express.server.service.IDormitoryInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
@Service
@Slf4j
public class DormitoryInfoServiceImpl extends ServiceImpl<DormitoryInfoMapper, DormitoryInfo> implements IDormitoryInfoService {

    @Override
    public List<DormitoryInfo> getByDepartId(Byte id) throws Exception {
        List<DormitoryInfo> result = baseMapper.selectList(
                new QueryWrapper<DormitoryInfo>().lambda().eq(DormitoryInfo::getPart, id));
        return result;
    }

    @Override
    public DormitoryInfo getById(Byte id) throws Exception {
        return baseMapper.selectById(id);
    }

    @Override
    public DormitoryInfo getByName(String name) throws Exception {
        return baseMapper.selectOne(new QueryWrapper<DormitoryInfo>().lambda()
                 .eq(DormitoryInfo::getName, name));
    }
}
