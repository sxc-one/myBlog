package top.ysxc.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ysxc
 * @create 2021-05-21 4:39 下午
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world!";
    }
}
