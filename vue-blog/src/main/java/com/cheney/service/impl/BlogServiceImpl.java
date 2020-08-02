package com.cheney.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheney.entity.Blog;
import com.cheney.mapper.BlogMapper;
import com.cheney.service.BlogService;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
