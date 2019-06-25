package com.github.niu.express.server.service.impl;

import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.server.service.IBoatService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/8 10:08
 * @desc
 */
public class BoatServiceImplTest extends BaseTest{

    @Autowired
    IBoatService boatService;
    @Test
    public void getByQueryDTO() throws Exception {
        BoatQueryDTO dto = new BoatQueryDTO();
        dto.setDestinationName("456");
        boatService.getByQueryDTO(dto).forEach(System.out::println);
    }
}
