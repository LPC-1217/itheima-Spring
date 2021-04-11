package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Component("userService")
@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

//    @Autowired //按照数据类型从Spring容器中进行匹配
//    @Qualifier("userDao") //时按照id名称从Spring容器中进行匹配，但是主要此处要结合@Autowire一起使用
    @Resource(name = "userDao") //相当于上面两个一起使用
    private UserDao userDao;

    @Value("${jdbc.driver}")
    private String driver;


    public void save() {
        userDao.save();
        System.out.println(driver);
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }
}
