package com.jm.rpc_demo.producer.impl;

import com.jm.rpc_demo.producer.HelloService;

/**
 * @author Long Qiong
 * @create 2019/1/7
 */
public class HelloServiceImpl implements HelloService {
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
