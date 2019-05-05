import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.service.IBoatRemote;
import com.github.niu.mvc.WorkApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.parameters.P;
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
}
