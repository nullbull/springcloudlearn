package com.github.niu.express.server.service.impl;

import com.github.niu.express.server.models.CompanyInfo;
import com.github.niu.express.server.mapper.CompanyInfoMapper;
import com.github.niu.express.server.service.ICompanyInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
public class CompanyInfoServiceImpl extends ServiceImpl<CompanyInfoMapper, CompanyInfo> implements ICompanyInfoService {

}
