package com.lxk.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableCaching
public class HelloworldApplication {

	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello world！";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
