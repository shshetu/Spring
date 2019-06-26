package com.shetu.Exmaple2;

import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        //create the proxy
        ProxyFactory pf = new ProxyFactory(); // proxy = it is used to implement aspect contracts, created by AOP frameworks
    pf.addAdvice(new SimpleBeforeAdvice());
    pf.setTarget(target);

    MessageWriter proxy = (MessageWriter) pf.getProxy();

    //write the message
        proxy.writeMessage();
    }

    //advice = action taken by an aspect by a particular join points
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable { //it executes before a join point
        System.out.println("Before method: "+method.getName());
    }
}
