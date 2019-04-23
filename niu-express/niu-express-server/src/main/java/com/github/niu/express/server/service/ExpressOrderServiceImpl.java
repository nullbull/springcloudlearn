package com.github.niu.express.server.service;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.ExpressException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.models.dto.ExpressDTO;
import com.github.niu.express.api.models.dto.OrderDTO;
import com.github.niu.express.server.models.ExpressOrder;
import com.github.niu.express.server.mapper.ExpressOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2019-04-22
 */
@Service
public class ExpressOrderServiceImpl extends ServiceImpl<ExpressOrderMapper, ExpressOrder> implements IExpressOrderService {

    @Override
    public int createExpress(ExpressDTO dto) throws Exception {
        ExpressOrder expressOrder = new ExpressOrder();
        expressOrder = dto.apply(expressOrder);
        expressOrder.setId(SnowFlowerUtils.createId());
        expressOrder.setCreatedAt(new Date());
        expressOrder.setStatus(Constants.EXPRESS_STATUS_NEW);
        return baseMapper.insert(expressOrder);
    }

    @Override
    public int updateExpress(ExpressDTO dto) throws Exception {
        Long id = dto.getId();
        ParameterAssert.isExpressValid(id, "id不能为空");
        ExpressOrder order = baseMapper.selectById(id);
        ParameterAssert.isExpressValid(order, ErrorCodeEnum.RECORD_NOT_EXIST);
        order = dto.apply(order);
        order.setUpdatedAt(new Date());
        return baseMapper.updateById(order);
    }

    @Override
    public int createOrder(OrderDTO dto) throws Exception {
        Long id = dto.getId();
        ParameterAssert.isExpressValid(id, "id不能为空");
        ExpressOrder order = baseMapper.selectById(id);
        ParameterAssert.isExpressValid(order, ErrorCodeEnum.RECORD_NOT_EXIST);

        order = order.apply(order);
        order.setBeginAt(new Date());
        order.setStatus(Constants.EXPRESS_STATUS_PICK_UP);
        return baseMapper.updateById(order);
    }

    @Override
    public int finished(Long id) throws Exception {
        ParameterAssert.isExpressValid(id, "id不能为空");
        ExpressOrder order = baseMapper.selectById(id);
        ParameterAssert.isExpressValid(order, ErrorCodeEnum.RECORD_NOT_EXIST);
        if (!order.getStatus().equals(Constants.EXPRESS_STATUS_PICK_UP)) {
            throw new ExpressException("请重试");
        }
        order.setStatus(Constants.EXPRESS_STATUS_FINISHED);
        order.setFinishedAt(new Date());
        return baseMapper.updateById(order);
    }
}
