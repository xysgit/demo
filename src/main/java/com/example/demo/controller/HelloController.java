package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述 TODO (用一句话描述该文件做什么)
 *
 * @author xuyousheng
 * @version v1.0
 * @date 2020-2-28 14:26
 **/
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
