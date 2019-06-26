package com.shetu.Example1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageDecorator implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Hello");
        Object retVal = methodInvocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
