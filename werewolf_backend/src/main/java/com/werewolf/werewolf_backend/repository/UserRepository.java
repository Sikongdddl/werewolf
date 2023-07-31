package com.werewolf.werewolf_backend.repository;

import com.werewolf.werewolf_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUname(String uname);

    User findByUnameAndPassword(String uname, String password);

    @Query("select u from User u")
    List<User> getUsers();
}
