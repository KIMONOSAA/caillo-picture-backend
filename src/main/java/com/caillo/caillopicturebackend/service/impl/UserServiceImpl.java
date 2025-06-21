package com.caillo.caillopicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caillo.caillopicturebackend.model.entity.User;
import com.caillo.caillopicturebackend.service.UserService;
import com.caillo.caillopicturebackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Zhan
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-06-21 21:31:13
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




