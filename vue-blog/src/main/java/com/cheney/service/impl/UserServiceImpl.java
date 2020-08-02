package com.cheney.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheney.entity.User;
import com.cheney.mapper.UserMapper;
import com.cheney.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
