package com.shetu.Example3;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("");
        System.out.println("After method: "+ method.getName());
    }

    public static void main(String[] args) {
       MessageWriter target = new MessageWriter();

       //create the proxy
        ProxyFactory pf = new ProxyFactory();

        //adding advice method
        pf.addAdvice(new SimpleAfterReturningAdvice());

        //set target method
        pf.setTarget(target); //bind with the MessageWriter class

        //Making proxy
        MessageWriter proxy = (MessageWriter) pf.getProxy();

        //write the messages
        proxy.writeMessage();



    }

}
