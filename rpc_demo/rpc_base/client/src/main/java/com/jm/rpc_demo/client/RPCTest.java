package com.jm.rpc_demo.client;

import com.jm.rpc_demo.producer.HelloService;
import com.jm.rpc_demo.producer.impl.HelloServiceImpl;
import com.jm.service_center.RpcServer;
import com.jm.service_center.impl.RpcServerImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author Long Qiong
 * @create 2019/1/23
 */
public class RPCTest {
    public static void main(String[] args) throws IOException {

       /* new Thread(new Runnable() {

            public void run() {

                try {

                    RpcServer serviceServer = new RpcServerImpl(8088);

                    serviceServer.register(HelloService.class, HelloServiceImpl.class);

                    serviceServer.start();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }).start();*/

        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));

        System.out.println(service.sayHi("test"));

    }
}
