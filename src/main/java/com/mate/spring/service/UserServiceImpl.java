package com.mate.spring.service;

import com.mate.spring.dao.UserDao;
import com.mate.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }
}
