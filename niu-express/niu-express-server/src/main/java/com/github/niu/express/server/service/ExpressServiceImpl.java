package com.github.niu.express.server.service;

import com.github.niu.express.server.models.Express;
import com.github.niu.express.server.mapper.ExpressMapper;
import com.github.niu.express.server.service.IExpressService;
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
public class ExpressServiceImpl extends ServiceImpl<ExpressMapper, Express> implements IExpressService {

}
