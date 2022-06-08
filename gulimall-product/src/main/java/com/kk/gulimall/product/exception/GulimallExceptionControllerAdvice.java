package com.kk.gulimall.product.exception;

import com.kk.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 集中处理所有异常
 */
@Slf4j
@ResponseBody
@ControllerAdvice(basePackages = "com/kk/gulimall/product/controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public R handleValidException(Exception e) {
        log.error("数据校验出现问题{},异常类型：{}", e.getMessage(), e.getClass());
        return R.error();
    }
}
