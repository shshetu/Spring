package com.shetu.Exmaple2;

public class MessageWriter { //aspect = class containing join points
    public void writeMessage(){  //joinpoint = method execution/ exception handling etc.
        System.out.println("World!");
    }
}
