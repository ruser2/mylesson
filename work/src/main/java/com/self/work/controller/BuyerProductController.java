package com.self.work.controller;

import com.self.work.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 18:13
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public Response list(){
        Response response=new Response();
        return response;
    }
}
