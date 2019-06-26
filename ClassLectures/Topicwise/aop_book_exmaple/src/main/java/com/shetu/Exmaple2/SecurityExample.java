package com.shetu.Exmaple2;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityExample {
    public static void main(String[] args) {
        //get the security manager
        SecurityManager mgr = new SecurityManager();

        //get the bean
        SecureBean bean = getSecureBean();

        //try as clarence
        mgr.login("clarence","pwd");
        bean.writeSecureMessage();
        mgr.logout();

        //try as janm
        try{
            mgr.login("janm","pwd");
            bean.writeSecureMessage();
        }catch (SecurityException ex){
            System.out.println("Exception Caught: "+ ex.getMessage());
        }finally {
            mgr.logout();
        }

        //try with no credentials
        try{
            bean.writeSecureMessage();
        }catch (SecurityException ex){
            System.out.println("Exception Caught: "+ex.getMessage());
        }


    }

    private static SecureBean getSecureBean(){
        //create the targer
        SecureBean target = new SecureBean();

        //cretaet te hadvice
        SecurityAdvice advice = new SecurityAdvice();

        //get the proxy
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        SecureBean proxy = (SecureBean) factory.getProxy();
        return proxy;
    }
}
