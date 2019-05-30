package com.lovo.servlet.mybaits.uml.thread;

import com.lovo.servlet.mybaits.uml.MySingleton;

public class CreateSingleton extends  Thread{


    public void run() {
        MySingleton m= MySingleton.getMySingleton();
        System.out.printf(m.toString());
    }
}
