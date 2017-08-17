package com.mate.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("userService2")
public class UserServiceImpl2 implements UserService {
    public void doSomething() {

    }
}
