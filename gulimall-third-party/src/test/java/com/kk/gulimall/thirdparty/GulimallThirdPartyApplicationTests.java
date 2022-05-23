package com.kk.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;
    @Test
    void testUpload() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/Users/kk/Documents/MyArtical/conner.png");
        ossClient.putObject("kk-java-edu", "test1.jpg", fileInputStream);
        ossClient.shutdown();
        System.out.println("it's ok!");
    }

}
