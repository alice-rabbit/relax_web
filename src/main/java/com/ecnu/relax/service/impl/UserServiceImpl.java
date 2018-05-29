package com.ecnu.relax.service.impl;

import com.ecnu.relax.model.User;
import com.ecnu.relax.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl implements IUserService {
    @Override
    public int login(Integer phone, String password) {
        return 12345;
    }
}
