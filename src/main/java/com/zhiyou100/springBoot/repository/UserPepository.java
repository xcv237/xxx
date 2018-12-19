package com.zhiyou100.springBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhiyou100.springBoot.model.User;

public interface UserPepository extends CrudRepository<User, Integer>{

}
