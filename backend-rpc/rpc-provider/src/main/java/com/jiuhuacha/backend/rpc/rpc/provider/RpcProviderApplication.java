package com.jiuhuacha.backend.rpc.rpc.provider;

import com.jiuhuacha.backend.rpc.rpc.core.api.RpcRequest;
import com.jiuhuacha.backend.rpc.rpc.core.api.RpcResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiuhuacha
 */
@SpringBootApplication
public class RpcProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcProviderApplication.class, args);
    }

    /**
     * HTTP + Json的方式提供远程调用通信,请求和响应都应该属于框架的一部分
     * RpcRequest 请求参数
     * RpcResponse 响应参数
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public RpcResponse invoke(RpcRequest rpcRequest) {
        return invokeMethod(rpcRequest);
    }

    /**
     * 通过反射形式实现
     */
    public RpcResponse invokeMethod(RpcRequest rpcRequest) {
        return null;
    }

}
