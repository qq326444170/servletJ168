package com.lovo.servlet.mybaits.uml;

public class MySingleton {
    //私有的构造方法
    private  MySingleton(){}
    private static MySingleton mySingleton=null;

    public static MySingleton getMySingleton(){

        synchronized(MySingleton.class){
        if(null==mySingleton){
            try {
                Thread.sleep(1000*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                mySingleton = new MySingleton();
            }
        }
        return  mySingleton;
    }

}
