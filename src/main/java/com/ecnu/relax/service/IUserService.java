package com.ecnu.relax.service;

public interface IUserService extends BaseService{
    int login(String phone,String password);
}
