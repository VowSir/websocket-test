package com.example.websockettest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/9/2 11:15
 * @Author by ming
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object test() {
        return "test";
    }
}
