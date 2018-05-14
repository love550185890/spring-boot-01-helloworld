package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liushaofei on 2018/5/15.
 *
 */
@Controller
public class HelloWorldController {

  @ResponseBody
  @RequestMapping("/hello")
  public String hello(){
    return "hello world, spring boot!!!";
  }
}
