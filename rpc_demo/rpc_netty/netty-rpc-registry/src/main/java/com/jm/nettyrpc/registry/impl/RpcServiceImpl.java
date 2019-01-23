package com.jm.nettyrpc.registry.impl;

import com.jm.nettyrpc.api.RpcService;

/**
 * @author Long Qiong
 * @create 2019/1/23
 */
public class RpcServiceImpl implements RpcService {
    @Override
    public String hello(String name) {
        return "hello,my name is "+name;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
