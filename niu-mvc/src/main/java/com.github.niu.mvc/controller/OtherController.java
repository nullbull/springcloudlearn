package com.github.niu.mvc.controller;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.constants.ReturnData;
import com.github.niu.common.constants.SiteVO;
import com.github.niu.common.utils.QiniuUtil;
import com.github.niu.common.utils.SnowFlowerUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;


/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/8 6:33
 * @desc
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    @RequestMapping("/getSite")
    public List<SiteVO> getSites() {
        return Constants.siteVOList;
    }

    @RequestMapping("/uplode")
    public String uplode(HttpServletRequest request) throws IOException {
        Random random = new Random(37);

        MultipartHttpServletRequest multipartFileR = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartFileR.getFile("file");
        if (multipartFile != null) {
            String basePath = "D:\\test";
            String temp = multipartFile.getOriginalFilename();
//            File file = new File(basePath + "/" + );
            return QiniuUtil.fileUpload(multipartFile.getInputStream(), temp);
        }
        return "";
    }
}
