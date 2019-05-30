package com.lovo.servlet.mybaits;

import com.lovo.servlet.mybaits.db.GetSession;
import org.junit.Test;

public class TConnection {
    @Test
    public void testDriver(){
        try {
            Class<?> cl= Class.forName("com.mysql.jdbc.Driver");
            System.out.printf(cl.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test(){
        System.out.printf(GetSession.creatSession()+"");

    }
}
