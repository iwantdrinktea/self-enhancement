package com.jiuhuacha.backend.rpc.rpc.core.api;

import java.util.Arrays;

/**
 * @description: 请求参数类
 * @author: jiuhuacha
 * @create: 2024-06-20 22:17
 */
public class RpcRequest {
    private String serviceName;
    private String methodName;
    private Object[] args;

    public RpcRequest() {
    }

    public RpcRequest(String serviceName, String methodName, Object[] args) {
        this.serviceName = serviceName;
        this.methodName = methodName;
        this.args = args;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "RpcRequest{" + "serviceName='" + serviceName + '\'' + ", methodName='" + methodName + '\'' + ", args=" + Arrays.toString(args) + '}';
    }
}
