package com.dylan.mybatisplusdruidview.persistence.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dylan.mybatisplusdruidview.persistence.model.User;
import com.dylan.mybatisplusdruidview.persistence.repository.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author baoxiang
 * @create 2020-06-13 17:40
 */
@Service
public  class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
