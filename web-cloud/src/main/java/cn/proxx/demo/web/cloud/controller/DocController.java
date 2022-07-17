package cn.proxx.demo.web.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文档-2
 */
@RestController
@RequestMapping("/doc")
public class DocController {

    /**
     * 用户说话-2
     *
     * @param username 用户名 | proxx
     * @param topic    话题 | hello, boy.
     * @return {@link String}
     */
    @GetMapping("/info")
    public String info(@RequestParam String username, @RequestParam String topic) {
        return username + ": " + topic;
    }

}
