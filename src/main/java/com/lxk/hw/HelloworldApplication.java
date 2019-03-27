package com.lxk.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient

public class HelloworldApplication {

	@RequestMapping("hello")
	@ResponseBody
	public String hello(HttpServletRequest request){
		return request.getRequestURL().toString()+"  hello world！";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}

