package com.zhiyou100.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.service.UserService;
import com.zhiyou100.springBoot.service.UserService2;
import com.zhiyou100.springBoot.service.UserService3;

@RestController
public class UserController3 {
	@Autowired
	UserService3 userService;
	@RequestMapping("/findAll3")
	public List<User> find(){
		Pageable page= new PageRequest(0,2);
		Page<User> p = userService.find(page);
		int a=6/0;
		System.out.println(p.getNumber());
		System.out.println(p.getSize());
		System.out.println(p.getPageable());
		System.out.println(p.getContent());
		System.out.println(p.getNumberOfElements());
		System.out.println(p.getTotalPages());
		return p.getContent();
	}
}
