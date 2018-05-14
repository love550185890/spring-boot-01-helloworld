package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liushaofei on 2018/5/15.
 */
//@SpringBootApplication来标注是一个springboot应用
@SpringBootApplication
public class HelloWorldMainApp {
  public static void main(String[] args) {
    SpringApplication.run(HelloWorldMainApp.class,args);
  }
}
