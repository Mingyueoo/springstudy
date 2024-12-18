package com.ming.config;

import com.ming.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(MingConfig2.class)
public class MingConfig {
    //the same as<bean> return value= Class, getUser = bean_id;
    @Bean
    public User getUser(){
        return new User();
    }
}
