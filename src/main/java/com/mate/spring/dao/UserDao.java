package com.mate.spring.dao;

import com.mate.spring.model.User;

@Deprecated
public interface UserDao {

    void addUser(User user);

    User getUserByName(String name);

    User getUserByEmail(String email);

}
