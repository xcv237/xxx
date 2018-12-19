package com.zhiyou100.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.repository.UserPepository;
import com.zhiyou100.springBoot.repository.UserPepository2;
import com.zhiyou100.springBoot.repository.UserPepository3;
@Service
public class UserService3 {
	@Autowired
	private UserPepository3 userPepository3;
	
	public List<User> UserAll(){
		return (List<User>) userPepository3.findAll();
		
	}
	public Page<User> find(Pageable page){
		return userPepository3.findAll(page);
		
	}
}
