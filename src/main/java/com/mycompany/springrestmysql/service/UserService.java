package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(Long id);

    User saveUser(User user);

    void deleteUser(User user);
}
