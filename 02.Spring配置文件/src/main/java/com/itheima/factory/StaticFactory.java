package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
