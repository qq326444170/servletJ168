package com.lovo.servlet.mybaits;

import com.lovo.servlet.mybaits.db.GetSession;
import com.lovo.servlet.mybaits.entity.StudentEntity;
import com.lovo.servlet.mybaits.entity.TeacherEntity;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TMybaits {
    SqlSession session=null;
    @Before
    public void getConnection(){
    session=GetSession.creatSession();
}
    @Test
    /**
     * 注册方法
     */
    public void addUser(){
        StudentEntity stu=new StudentEntity();
        stu.setUserName("刘德仁");
        stu.setUserPwd("1234");
        stu.setUserAge(25);
        stu.setUserGrade(120);
        session.insert("studentSpace.insertId",stu);
        session.commit();
    }
    @After
    public void closeConnection(){
        session.close();
    }
}
