package com.werewolf.werewolf_backend.dao;

import com.werewolf.werewolf_backend.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;


public interface UserDao {
    User get_user_by_name(String uname);

    User get_user_by_name_and_password(String uname, String password);

    User add(User user);

    List<User> getUsers();
}
