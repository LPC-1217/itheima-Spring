package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcTemplateTest {

    /**
     * 测试JdbcTemplate开发步骤
     */
    @Test
    public void test1() throws Exception {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setDriverClass("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象
        jdbcTemplate.setDataSource(dataSource);
        //执行操作
        int row = jdbcTemplate.update("insert into account values(?,?)", "tom", 5000);
        System.out.println(row);
    }
}
