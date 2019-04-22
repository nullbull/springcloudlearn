package com.github.niu.express.server.service;

import com.github.niu.express.server.models.ExpressOrder;
import com.github.niu.express.server.mapper.ExpressOrderMapper;
import com.github.niu.express.server.service.IExpressOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
