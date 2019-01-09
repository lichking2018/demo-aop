package com.wt.study.aop;

public class ManSayHelloWorld implements ISayHelloWorld{

    public String say() {
        System.out.println("Hello world");
        return "MAN";
    }
}
