package com.wt.study.aop;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * jdk方式实现aop
 */
public class AopTest {

    /**
     * 使用java的方式实现aop
     * 被处理的类需要实现接口
     */
    @Test
    public void test1(){
        ManSayHelloWorld manSayHelloWorld = new ManSayHelloWorld();
        AOPHandle aopHandle = new AOPHandle(manSayHelloWorld);
        ISayHelloWorld i = (ISayHelloWorld) Proxy.newProxyInstance(ManSayHelloWorld.class.getClassLoader(), new Class[]{ISayHelloWorld.class}, aopHandle);
        i.say();
    }

    /**
     * 通过cglib方式实现aop
     * 被处理的类不需要实现接口
     */
    @Test
    public void test2(){
        CglibProxy proxy = new CglibProxy();
        SayHello proxyImp = (SayHello)proxy.getProxy(SayHello.class);
        proxyImp.say();
    }
}
