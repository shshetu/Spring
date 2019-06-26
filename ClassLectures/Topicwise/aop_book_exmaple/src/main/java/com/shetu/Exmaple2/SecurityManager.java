package com.shetu.Exmaple2;

public class SecurityManager {
    //creating a threadlocal instance
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<UserInfo>();

    public void login(String userName, String password ){
        //assumes that all credentials are valid for a login
        threadLocal.set(new UserInfo(userName,password));
     }

    public void logout(){
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUser(){
        return threadLocal.get();
    }
}
