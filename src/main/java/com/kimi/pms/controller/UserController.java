package com.kimi.pms.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/5/11.
 */
@Controller
public class UserController  {



    @RequestMapping("/login")
    public String login(){

       return "login";
    }

}
