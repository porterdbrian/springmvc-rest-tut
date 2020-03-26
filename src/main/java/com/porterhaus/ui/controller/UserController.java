package com.porterhaus.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "getUser!";
	}
	
	@PostMapping
	public String createUser() {
		return "createUser!";
	}
	
	@PutMapping
	public String updateUser() {
		return "updateUser!";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "deleteUser!";
	}
}
