package com.jm.service_center;

import com.jm.rpc_demo.producer.HelloService;
import com.jm.rpc_demo.producer.impl.HelloServiceImpl;
import com.jm.service_center.impl.RpcServerImpl;

import java.io.IOException;

/**
 * @author Long Qiong
 * @create 2019/1/23
 */
public class StartServer {
    public static void main(String[] args) {
        new Thread(new Runnable() {

            public void run() {

                try {

                    RpcServer serviceServer = new RpcServerImpl(8088);

                    serviceServer.register(HelloService.class, HelloServiceImpl.class);

                    serviceServer.start();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }).start();
    }
}
