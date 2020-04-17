package com.porterhaus.springmvcresttut.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {
	
	@Autowired
	private Environment env;
	
	public String getToken() {
		return env.getProperty("tokenSecret");
	}
	
}
