package com.mate.spring.service;

import com.mate.spring.dao.UserDao;
import com.mate.spring.model.Category;
import com.mate.spring.model.Product;
import com.mate.spring.model.Role;
import com.mate.spring.model.User;
import com.mate.spring.service.validation.UserPropertiesValidatorImpl;
import com.mate.spring.service.validation.UserValidator;
import com.mate.spring.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private List<Validator> validators;


    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
