package com.jm.nettyrpc.api;

/**
 * @author Long Qiong
 * @create 2019/1/23
 */
public interface RpcService {
    String hello(String name);
    int add(int a,int b);
    int sub(int a,int b);
}
