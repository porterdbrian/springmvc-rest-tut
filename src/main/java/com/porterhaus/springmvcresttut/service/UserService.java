package com.porterhaus.springmvcresttut.service;

import com.porterhaus.springmvcresttut.shared.dto.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);
}
