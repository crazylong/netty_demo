package com.jm.nettyrpc.consumer;

import com.jm.nettyrpc.api.RpcService;
import com.jm.nettyrpc.consumer.proxy.RpcProxy;

/**
 * @author Long Qiong
 * @create 2019/1/23
 */
public class RpcConsumer {
    public static void main( String[] args ){
        RpcService service = RpcProxy.create(RpcService.class);
        String hello = service.hello("rpc");
        System.out.println(hello);
        System.out.println(service.add(5, 3));
        System.out.println(service.sub(5, 3));
    }
}
