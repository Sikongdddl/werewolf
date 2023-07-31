package com.werewolf.werewolf_backend.service;

import com.werewolf.werewolf_backend.entity.User;

import java.util.List;

public interface UserService {
    User loginService(String uname, String password);

    User registService(User user);

    List<User> getUsers();
}
