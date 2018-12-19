package com.zhiyou100.springBoot.Controll;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.springBoot.model.User;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map){
		map.put("q", "qwe");
		return "Hellow";
	}
	@RequestMapping("/getuser")
	public User getuser(){
		User user = new User();
		user.setName("我");
		user.setId(1);
		user.setAge(15);
		System.out.println(user);
		return user;		
	}
	@RequestMapping("/getuser2")
	public List<User> getuser2(){
		User user = new User();
		user.setName("我");
		user.setId(1);
		user.setAge(15);
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(new User(2,"答",3));
		list.add(new User(3,"额外",15));
		System.out.println(user);
		return list;		
	}
}
