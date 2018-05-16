package com.zhouyh.myspringboot.response;

import com.zhouyh.myspringboot.enums.ErrorEnum;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 14:46
 * @Description:
 */
public class ResponseUtil {
    public static Response success(Object result){
        Response response=new Response();
        response.setCode(0);
        response.setData(result);
        response.setMessage("Success");
        return response;
    }

    public static Response fail(Integer code,String message){
        Response response=new Response();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static Response fail(ErrorEnum errorEnum){
        Response response=new Response();
        response.setCode(errorEnum.getCode());
        response.setMessage(errorEnum.getMessage());
        return response;
    }
}
