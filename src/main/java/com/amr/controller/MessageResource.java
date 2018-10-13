package com.amr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@RefreshScope
public class MessageResource {

	@Value("${user.role: Default username}")
	private String role;

	@GetMapping("/profile/{name}")
	public String getActiveProfile(@PathVariable String name){
		return "Hello "+name+"! active profile name is "+role;
	}

}
