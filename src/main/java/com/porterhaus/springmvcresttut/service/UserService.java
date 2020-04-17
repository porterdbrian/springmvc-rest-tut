package com.porterhaus.springmvcresttut.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.porterhaus.springmvcresttut.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
}
