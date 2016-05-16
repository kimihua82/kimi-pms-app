package com.kimi.pms.controller;

import com.kimi.pms.po.UserEntity;
import com.kimi.pms.session.SessionContext;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/5/11.
 */
@Controller
public class UserController  {

    @RequestMapping("/login")
    public String login() {
        UserEntity user = new UserEntity();
        user.setUserName("Kimi");
        user.setUserId(100L);
        SessionContext.getSession().setAttribute("userId", 999);
        SessionContext.getSession().setAttribute("ddd", user);


        return "login";
    }

    @RequestMapping("/login1")
    public String login1(){
        UserEntity obj= (UserEntity)SessionContext.getSession().getAttribute("ddd");
        return "login";
    }


}
