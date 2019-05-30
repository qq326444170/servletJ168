package com.lovo.servlet.mybaits.uml.thread;

import com.lovo.servlet.mybaits.uml.MySingleton;

public class T {

    public static void main(String[] args) {
         CreateSingleton cs=new CreateSingleton();
         cs.start();

        MySingleton m2= MySingleton.getMySingleton();
        System.out.printf(m2.toString());
    }

}
