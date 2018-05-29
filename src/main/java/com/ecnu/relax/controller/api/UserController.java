package com.ecnu.relax.controller.api;

import com.ecnu.relax.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController extends APIBaseController{
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public Map login(/*@RequestParam("phone")Integer phone, @RequestParam("password") String password*/){
        Map<String,Object> result = new HashMap<>();
        int loginResult = 0;
        String message;
        loginResult = 12345/*userService.login(phone,password)*/;
        switch (loginResult){
            case -1:
                message = "没有该用户";
                break;
            case 0:
                message = "密码错误";
                break;
            default:
                /*如果该用户存在且密码正确*/
                HttpSession session = request.getSession();
                session.setAttribute("userId", loginResult);
                message = "登录成功";
                break;
        }
        result.put("userId", loginResult);
        result.put("returnMessage", message);
        return result;
    }
}
