package com.lovo.servlet.mybaits.uml.factory;

public class M2Factory implements BasicFactoryBMW {
    @Override
    public IBMW createMMW() {
        return new BMWM2();
    }
}
