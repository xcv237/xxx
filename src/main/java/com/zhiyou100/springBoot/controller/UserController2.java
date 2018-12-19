package com.zhiyou100.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.service.UserService;
import com.zhiyou100.springBoot.service.UserService2;

@RestController
public class UserController2 {
	@Autowired
	UserService2 userService;
	@RequestMapping("/xx")
	public User find(){
		return userService.xx("da");	
	}
}
