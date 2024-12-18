package com.ming.service.impl;

import com.ming.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello,Spring framework";
    }
}
