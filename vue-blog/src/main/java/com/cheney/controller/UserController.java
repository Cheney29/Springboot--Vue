package com.cheney.controller;


import com.cheney.common.lang.Result;
import com.cheney.entity.User;
import com.cheney.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){

        User user =  userService.getById(1L);
        return Result.success(user);
    }
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){

        return Result.success(user);
    }

}
