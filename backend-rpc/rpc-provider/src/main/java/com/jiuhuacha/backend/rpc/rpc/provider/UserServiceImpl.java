package com.jiuhuacha.backend.rpc.rpc.provider;

import com.jiuhuacha.backend.rpc.demo.api.User;
import com.jiuhuacha.backend.rpc.demo.api.UserService;
import org.springframework.stereotype.Service;

/**
 * @description: 用户服务实现类
 * @author: jiuhuacha
 * @create: 2024-06-20 22:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Integer uid) {
        return new User(uid, "jiuhuacha-" + System.currentTimeMillis());
    }
}
