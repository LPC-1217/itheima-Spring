package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
