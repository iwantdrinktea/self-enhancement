package com.jiuhuacha.backend.rpc.rpc.core.api;

/**
 * @description: 响应参数类
 * @author: jiuhuacha
 * @create: 2024-06-20 22:20
 */
public class RpcResponse<T> {
    private Integer code;
    private String message;
    private T data;

    public RpcResponse() {
    }

    public RpcResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RpcResponse{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }
}
