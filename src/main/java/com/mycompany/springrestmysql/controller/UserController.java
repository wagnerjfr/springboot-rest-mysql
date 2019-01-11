package com.mycompany.springrestmysql.controller;

import com.mycompany.springrestmysql.dto.CreateUser;
import com.mycompany.springrestmysql.model.User;
import com.mycompany.springrestmysql.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@Valid @RequestBody CreateUser createUser) {
        User user = new User();
        user.setName(createUser.getName());
        user.setEmail(createUser.getEmail());
        return userService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody CreateUser createUser, @PathVariable Long id) {
        User user = userService.getUser(id);
        user.setName(createUser.getName());
        user.setEmail(createUser.getEmail());
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        userService.deleteUser(user);
    }
}
