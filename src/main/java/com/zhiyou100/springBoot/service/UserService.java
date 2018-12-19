package com.zhiyou100.springBoot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.springBoot.model.User;
import com.zhiyou100.springBoot.repository.UserPepository;
@Service
public class UserService {
	@Autowired
	private UserPepository userPepository;
	
	@Transactional
	public void save(User u){
		userPepository.save(u);
	}
	@Transactional
	public void delete(int id){
		userPepository.deleteById(id);
	}

	public User getUser(int id){	
		return userPepository.findById(id).get();
	}

	public Iterable<User> getAllUser(){	
		return userPepository.findAll();
	}
}
