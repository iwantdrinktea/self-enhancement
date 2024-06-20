package com.jiuhuacha.backend.rpc.rpc.core.annotation;

import java.lang.annotation.*;


@Documented // 显示被 它 标注的注解类型应该被 javadoc 或者类似工具文档化
@Retention(RetentionPolicy.RUNTIME) // 起作用的时机，运行时
@Target(ElementType.TYPE)  // 放在类型
@Inherited // 允许继承
public @interface RpcProvider {
}
