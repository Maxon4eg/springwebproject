package com.mate.spring.service;

import com.mate.spring.model.User;

public interface UserService {

    void addUser(User user);

    User getUserByName(String name);

}
