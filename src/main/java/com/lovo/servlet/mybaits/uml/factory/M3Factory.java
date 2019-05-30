package com.lovo.servlet.mybaits.uml.factory;

public class M3Factory implements BasicFactoryBMW {
    @Override
    public IBMW createMMW() {
        return new BMWM3();
    }
}
