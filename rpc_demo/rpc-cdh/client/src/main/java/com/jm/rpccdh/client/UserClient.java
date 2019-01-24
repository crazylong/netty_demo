package com.jm.rpccdh.client;

import com.jm.rpccdh.service.UserService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author Long Qiong
 * @create 2019/1/24
 */
public class UserClient {
    public static void main(String[] args) throws IOException {

        Configuration configuration = new Configuration();

        long clientVersion=8888;

        UserService proxy = RPC.getProxy(UserService.class, clientVersion, new InetSocketAddress("localhost", 9999), configuration);

        proxy.addUser("lisi",22);

        System.out.println("添加成功");



    }
}
