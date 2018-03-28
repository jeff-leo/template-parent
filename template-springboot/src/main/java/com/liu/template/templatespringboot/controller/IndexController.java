package com.liu.template.templatespringboot.controller;

import com.liu.template.templatespringboot.po.User;
import com.liu.template.templatespringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujianfeng
 * @date 2018/3/28 15:50
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{uid}")
    public User getUser(@PathVariable("uid") String uid) {
        return userService.getUser(uid);
    }
}
