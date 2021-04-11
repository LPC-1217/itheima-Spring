package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    /**
     * 原始配置方式
     */
    /*public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }*/



    /**
     * set方式注入
     */
   /* private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/



    /**
     * 构造方法注入
     */
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }





    public void save(){
        userDao.save();
    }
}
