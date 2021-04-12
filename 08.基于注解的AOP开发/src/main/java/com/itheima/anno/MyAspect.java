package com.itheima.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect //标注当前MyAspect是一个切面类
public class MyAspect {

    //配置前置增强
    @Before("execution(* com.itheima.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强......");
    }
}
