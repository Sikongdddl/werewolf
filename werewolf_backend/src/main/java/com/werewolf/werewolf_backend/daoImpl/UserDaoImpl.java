package com.werewolf.werewolf_backend.daoImpl;

import com.werewolf.werewolf_backend.dao.UserDao;
import com.werewolf.werewolf_backend.entity.User;
import com.werewolf.werewolf_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User get_user_by_name(String uname){
        return userRepository.findByUname(uname);
    }

    @Override
    public User get_user_by_name_and_password(String uname, String password){
        return userRepository.findByUnameAndPassword(uname,password);
    }

    @Override
    public User add(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers(){return userRepository.getUsers();}
}
