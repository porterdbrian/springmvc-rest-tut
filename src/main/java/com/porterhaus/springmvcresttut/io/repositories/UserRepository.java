package com.porterhaus.springmvcresttut.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.porterhaus.springmvcresttut.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findUserById(String userId);
}	
