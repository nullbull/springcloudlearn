import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.utils.HttpClientUtil;
import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.service.IBoatRemote;
import com.github.niu.mvc.WorkApplication;
import com.github.niu.mvc.config.RedisUtil;
import com.github.niu.user.api.service.IAddressRemote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 19:51
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkApplication.class)
public class test {
    @Autowired
    IBoatRemote boatRemote;

    @Autowired
    IAddressRemote addressRemote;


    @Autowired
    RedisUtil redisUtil;

    @Test
    public void hh() throws Exception {
        BoatDTO boatDTO = new BoatDTO();
        boatDTO.setBeginAt(new Date());
        boatDTO.setEndAt(new Date());
        boatDTO.setContent("hhhha");
        boatDTO.setDriverId(123L);
        boatDTO.setDriverNickname("张炜婷");
        boatDTO.setSmallPrice(new BigDecimal("1.2"));
        boatDTO.setLargePrice(new BigDecimal("1.2"));
        boatDTO.setNormalPrice(new BigDecimal("1.2"));
        boatDTO.setSmallCount((byte)1);
        boatDTO.setNormalCount((byte)1);
        boatDTO.setLargeCount((byte)1);
        boatRemote.add(boatDTO);
    }
    @Test
    public void test() throws Exception {
        addressRemote.getUserId(123L);
    }

    @Test
    public void wuyu() throws Exception {
//        redisUtil.set(Constants.WX_CODE_KEY + "123", "456");
        System.out.println(redisUtil.get(Constants.WX_CODE_KEY + "123"));
    }

    @Test
    public void hhh() throws Exception {
        String url = String.format(Constants.WX_URL, "1234567");
        JSONObject jb = JSON.parseObject(HttpClientUtil.doGet(url));
        System.out.println(jb.toString());
    }

    @Test
    public void hhhhhh() throws Exception {
        boatRemote.list(new BoatQueryDTO()).forEach(System.out::println);
    }
}
