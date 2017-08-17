package com.mate.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("userService1")
public class UserServiceImpl implements UserService {

    public void doSomething() {

    }
}
