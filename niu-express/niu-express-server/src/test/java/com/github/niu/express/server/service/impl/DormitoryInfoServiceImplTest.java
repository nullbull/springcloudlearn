package com.github.niu.express.server.service.impl;

import com.github.niu.express.server.models.DormitoryInfo;
import com.github.niu.express.server.service.IDormitoryInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 13:48
 * @desc
 */
public class DormitoryInfoServiceImplTest extends BaseTest{

    @Autowired
    private IDormitoryInfoService dormitoryInfoService;
    @Test
    public void getByDepartId() throws Exception {
        DormitoryInfo info = dormitoryInfoService.getByInfoID((byte) 18);
        Assert.assertEquals("B1", info.getName());
    }

    @Test
    public void getByInfoID() {

    }

    @Test
    public void getByName() {
    }
}
