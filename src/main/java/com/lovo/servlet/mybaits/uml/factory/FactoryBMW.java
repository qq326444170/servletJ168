package com.lovo.servlet.mybaits.uml.factory;

public class FactoryBMW {

    public  IBMW createBMW(int tag){
        IBMW bmw=null;
        switch (tag){
            case 1:
             bmw=    new BMWM2();
                 break;
            case 2:
                bmw=        new BMWM3();
                break;
        }
        return bmw;
    }
}
