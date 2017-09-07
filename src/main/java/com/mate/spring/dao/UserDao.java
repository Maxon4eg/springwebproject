package com.mate.spring.dao;

import com.mate.spring.model.User;

public interface UserDao {

    void addUser(User user);

    User getUserByName(String name);

}
