package com.ecnu.relax.controller.api;

import com.ecnu.relax.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController extends APIBaseController{
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public int login(@RequestParam("phone")String phone, @RequestParam("password") String password){
        int loginResult = 0;
        String message;
        loginResult = userService.login(phone,password);
        switch (loginResult){
            case -1:
                message = "没有该用户";
                break;
            case 0:
                message = "密码错误";
                break;
            default:
                //登录成功
                HttpSession session = request.getSession();
                session.setAttribute("userId", loginResult);
                message = "登录成功";
                break;
        }
        return loginResult;
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public int register(@RequestParam("nickname")String nickname,@RequestParam("realname")String realname,@RequestParam("phone")String phone, @RequestParam("password") String password){
        int registerResult = 0;
        String message;
        registerResult = userService.register(nickname,realname,phone,password);
        switch (registerResult){
            case -1:
                message = "该手机号已经被注册";
                break;
            default:
                //注册成功
                HttpSession session = request.getSession();
                session.setAttribute("userId", registerResult);
                message = "注册成功";
                break;
        }
        return registerResult;
    }

}
