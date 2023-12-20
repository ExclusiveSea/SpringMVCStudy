package com.example.controller;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.example.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping( "/")
    public ModelAndView index(){
        return new ModelAndView("index");  //返回ModelAndView对象，这里填入了视图的名称
        //返回后会经过视图解析器进行处理
    }

    @ResponseBody
    @GetMapping("/test")
    public User test(){
        return new User("Test","123456");
    }


}
