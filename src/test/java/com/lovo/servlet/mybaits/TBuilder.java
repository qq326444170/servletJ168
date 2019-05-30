package com.lovo.servlet.mybaits;

import com.lovo.servlet.mybaits.uml.*;
import com.lovo.servlet.mybaits.uml.factory.*;
import org.junit.Test;

public class TBuilder {

    @Test
    public  void testBuilder(){
       //构建者开始构建
        HeroBuilder hb=new VNVIPBuilder();
        //生产者
        MakeHero mk=new MakeHero(hb);
          mk.build();//开始构建
        Hero h= mk.getHero(); //获得构建好的英雄
        System.out.printf(h.getKill()+","+h.getKien());

    }
    @Test
    public  void testFactory(){
        FactoryBMW fb=new FactoryBMW();
       IBMW bmw= fb.createBMW(2);
        System.out.printf(bmw.carName());
    }
  @Test
    public  void testMethodFactory(){
        BasicFactoryBMW basicFactoryBMW=new M3Factory();
        IBMW bmw=basicFactoryBMW.createMMW();
        System.out.printf(bmw.carName());
    }

    @Test
    public  void tSingleton(){

        MySingleton m= MySingleton.getMySingleton();
        System.out.printf(m.toString());

        MySingleton m2= MySingleton.getMySingleton();
        System.out.printf(m2.toString());
    }
}
