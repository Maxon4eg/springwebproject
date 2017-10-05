package com.mate.spring.service;

import com.mate.spring.dao.UserDao;
import com.mate.spring.model.User;
import com.mate.spring.service.validation.UserPropertiesValidatorImpl;
import com.mate.spring.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MailService mailService;

    @Autowired
    private UserPropertiesValidatorImpl validators;


    public void addUser(User user) {
        if(validators.validate(user)) {
            mailService.send(user);
            userDao.addUser(user);
        }
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }
}
