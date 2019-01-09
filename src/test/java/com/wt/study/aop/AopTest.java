package com.wt.study.aop;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class AopTest {
    @Test
    public void test1(){
        ManSayHelloWorld manSayHelloWorld = new ManSayHelloWorld();
        AOPHandle aopHandle = new AOPHandle(manSayHelloWorld);
        ISayHelloWorld i = (ISayHelloWorld) Proxy.newProxyInstance(ManSayHelloWorld.class.getClassLoader(), new Class[]{ISayHelloWorld.class}, aopHandle);
        i.say();
    }
}
