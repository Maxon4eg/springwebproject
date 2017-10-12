package com.mate.spring.service;

import com.mate.spring.dao.UserRepository;
import com.mate.spring.model.User;
import com.mate.spring.service.validation.UserPropertiesValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    private UserPropertiesValidatorImpl validators;


    public void addUser(User user) {
        if(validators.validate(user)) {
            mailService.send(user);
            userRepository.save(user);
        }
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
