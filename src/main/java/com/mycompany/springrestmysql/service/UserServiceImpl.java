package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.exception.UserNotFoundException;
import com.mycompany.springrestmysql.model.User;
import com.mycompany.springrestmysql.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(u -> userList.add(u));
        return userList;
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id)
            .orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
