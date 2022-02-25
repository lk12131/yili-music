package com.hgx.yili_music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title
 * @Author hgx
 * @Date 2022/2/25 21:13
 * @Version 1.0
 * @Desc
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String sayHello() {
        return "欢迎你来到这";
    }
}
