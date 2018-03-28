package com.liu.template.templatespringboot.service;

import com.liu.template.templatespringboot.po.User;

/**
 * @author liujianfeng
 * @date 2018/3/28 16:45
 */
public interface UserService {

    User getUser(String uid);
}
