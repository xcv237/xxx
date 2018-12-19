package com.zhiyou100.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.repository.UserPepository;
import com.zhiyou100.springBoot.repository.UserPepository2;
@Service
public class UserService2 {
	@Autowired
	private UserPepository2 userPepository2;
	
	public User xx(String n){
		return userPepository2.xx(n);	
	}
}
