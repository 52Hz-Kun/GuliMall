package com.kk.gulimall.product;

//import com.aliyun.oss.OSSClient;
import com.kk.gulimall.product.entity.BrandEntity;
import com.kk.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("哈哈哈哈哈哈111");
        brandEntity.setName("华为2222");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

//    @Autowired
//    OSSClient ossClient;
//    @Test
//    void testUpload() throws Exception {
//        FileInputStream fileInputStream = new FileInputStream("/Users/kk/Documents/MyArtical/conner.png");
//        ossClient.putObject("kk-java-edu", "test.jpg", fileInputStream);
//        ossClient.shutdown();
//        System.out.println("it's ok!");
//    }

}
