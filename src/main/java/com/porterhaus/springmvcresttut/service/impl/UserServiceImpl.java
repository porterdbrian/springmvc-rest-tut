package com.porterhaus.springmvcresttut.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.porterhaus.springmvcresttut.UserRepository;
import com.porterhaus.springmvcresttut.io.entity.UserEntity;
import com.porterhaus.springmvcresttut.service.UserService;
import com.porterhaus.springmvcresttut.shared.Utils;
import com.porterhaus.springmvcresttut.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;

	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("An account with that email address already exists!");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String publicUserId = utils.generateUserId(32);
		userEntity.setUserId(publicUserId);
		userEntity.setEncryptedPassword("password");
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

}
