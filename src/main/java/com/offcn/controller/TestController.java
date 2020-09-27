package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","Hello");
        return "OK";
    }

    public  void  gittext(){

        System.out.println("测试提交");
    }

    public  void  gittextfenzhi(){

        System.out.println("测试分支提交");
    }
    public  void  gittextfenzhi1(){

        System.out.println("测试分支提交1");
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
