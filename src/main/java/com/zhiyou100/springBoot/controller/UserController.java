package com.zhiyou100.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/save")
	public void save(){
		User user = new User();
		user.setName("5565");
		user.setAge(15);
		userService.save(user);
	}
	@RequestMapping("/getUser")
	public User getUser(){	
		return userService.getUser(1);
	}
	@RequestMapping("/delete")
	public void delete(){
		int id=1;
		userService.delete(id);
	}
	@RequestMapping("/getAllUser")
	public Iterable<User> getAllUser(){	
		return userService.getAllUser();
	}
}
