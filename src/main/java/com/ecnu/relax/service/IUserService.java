package com.ecnu.relax.service;

public interface IUserService extends BaseService{
    int login(Integer phone,String password);
}
