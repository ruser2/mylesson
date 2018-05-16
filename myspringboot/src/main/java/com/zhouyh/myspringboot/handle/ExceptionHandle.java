package com.zhouyh.myspringboot.handle;

import com.zhouyh.myspringboot.enums.ErrorEnum;
import com.zhouyh.myspringboot.exception.ServiceException;
import com.zhouyh.myspringboot.response.Response;
import com.zhouyh.myspringboot.response.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 15:11
 * @Description:
 */
@ControllerAdvice
public class ExceptionHandle {
    public final Logger logger= LoggerFactory.getLogger(getClass());
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handle(Exception e) {
        if (e instanceof ServiceException) {
            ServiceException serviceException = (ServiceException) e;
            return ResponseUtil.fail(serviceException.getCode(), serviceException.getMessage());
        }else {
            logger.error("系统异常={}",e);
            return ResponseUtil.fail(ErrorEnum.UNKONW_ERROR);
        }

    }
}
