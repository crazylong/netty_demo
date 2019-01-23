package com.jm.service_center;

import java.io.IOException;

/**
 * @author Long Qiong
 * @create 2019/1/7
 */
public interface RpcServer {
    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();
}
