package com.jm.rpccdh;

import com.jm.rpccdh.service.UserService;
import com.jm.rpccdh.service.impl.UserServiceImpl;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

/**
 * @author Long Qiong
 * @create 2019/1/24
 */
public class ServerRPC {
    public static void main(String[] args) throws Exception{

        Configuration configuration = new Configuration();

        RPC.Builder builder = new RPC.Builder(configuration);

        RPC.Server server = builder.setProtocol(UserService.class)
                .setInstance(new UserServiceImpl())
                .setBindAddress("localhost")
                .setPort(9999)
                .build();

        server.start();

    }
}
