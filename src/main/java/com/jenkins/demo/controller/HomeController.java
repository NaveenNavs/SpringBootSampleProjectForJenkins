package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hellonavs")
	public String sayHello() {
		return "<h1>Welcome to navs first spring boot with jenkins - success!!<h1>";
	}

	@RequestMapping("/byenavs")
	public String sayBye() {
		return "<h1>Thank you navs, Take care!! Bye!!!<h1>";
	}
}
