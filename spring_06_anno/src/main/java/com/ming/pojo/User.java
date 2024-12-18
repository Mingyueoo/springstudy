package com.ming.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//= <bean id="user" class="com.ming.dao.User"></bean>
@Component
@Scope("singleton")
public class User {

    public String name ;
    // <property name="name" value="Mingyue1"></property>
    @Value("Mingyue1")
    public void setName(String name) {
        this.name = name;
    }
}