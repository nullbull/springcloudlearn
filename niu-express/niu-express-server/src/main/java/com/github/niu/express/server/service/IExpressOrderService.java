package com.github.niu.express.server.service;

import com.github.niu.express.api.models.dto.ExpressDTO;
import com.github.niu.express.api.models.dto.OrderDTO;
import com.github.niu.express.server.models.ExpressOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-04-22
 */
public interface IExpressOrderService extends IService<ExpressOrder> {

    int createExpress(ExpressDTO dto) throws Exception;

    int updateExpress(ExpressDTO dto) throws Exception;

    int createOrder(OrderDTO dto) throws Exception;

    int finished(Long id) throws Exception;
}
