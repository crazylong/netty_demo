package com.jm.rpccdh.service.impl;

import com.jm.rpccdh.service.UserService;

/**
 * @author Long Qiong
 * @create 2019/1/24
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String name, int age) {
        System.out.println("姓名："+name+" "+"年龄"+age);
    }

}
