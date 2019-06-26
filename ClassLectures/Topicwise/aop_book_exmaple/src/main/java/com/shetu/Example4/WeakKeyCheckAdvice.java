package com.shetu.Example4;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class WeakKeyCheckAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
     if((target instanceof KeyGenerator) && ("getKey".equals(method.getName()))){
         long key =( (Long)returnValue).longValue();

         if(key == KeyGenerator.WEAK_KEY){
             throw new SecurityException("Key Generator generated a weak key. Try again!");
         }
     }
    }
}
