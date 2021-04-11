package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //标志该类是Spring的一个核心配置类

//<context:component-scan base-package="com.itheima"/>
@ComponentScan("com.itheima")

@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
