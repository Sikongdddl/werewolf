package com.werewolf.werewolf_backend.serviceImpl;

import com.werewolf.werewolf_backend.dao.UserDao;
import com.werewolf.werewolf_backend.entity.User;
import com.werewolf.werewolf_backend.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    private void blank_password(User user)
    {
        user.setPassword("");
    }
    @Override
    public User loginService(String uname, String password) {
        User user = userDao.get_user_by_name_and_password(uname,password);
        if(user != null) {
            blank_password(user);
        }
        return user;
    }

    @Override
    public User registService(User user) {
        int existFlag = 0;
        if(userDao.get_user_by_name(user.getUname()) != null){
            existFlag=1;
        }
        if(existFlag==1){
            return null;
        }
        else{
            User newone = userDao.add(user);
            blank_password(newone);
            return newone;
        }
    }

    @Override
    public List<User> getUsers()
    {
        return userDao.getUsers();
    }
}
