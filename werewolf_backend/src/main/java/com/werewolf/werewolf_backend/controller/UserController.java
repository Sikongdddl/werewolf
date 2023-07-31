package com.werewolf.werewolf_backend.controller;

import com.werewolf.werewolf_backend.entity.User;
import com.werewolf.werewolf_backend.service.UserService;
import com.werewolf.werewolf_backend.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String uname, @RequestParam String password){
        User user = userService.loginService(uname,password);
        if(user != null){
            return Result.success(user,"Log in successfully");
        }else{
            return Result.error("-1","wrong username or password");
        }
    }

    @PostMapping("/register")
    public Result<User> registController(@RequestParam String uname, @RequestParam String password){
        User newone = new User();
        newone.setUname(uname);
        newone.setPassword(password);
        User user = userService.registService(newone);
        if(user != null){
            return Result.success(user,"regist successfully");
        }else{
            return Result.error("-2","username already exist");
        }
    }

    @PostMapping("/getUsers")
    public Result<List<User>> getUserController(){
        return Result.success(userService.getUsers(),"get users successfully");
    }
}
