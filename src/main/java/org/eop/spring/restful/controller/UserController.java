package org.eop.spring.restful.controller;

import java.util.Date;

import org.eop.spring.restful.bean.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
@RequestMapping(path = "/user")
@RestController
public class UserController {

	
	@GetMapping("/get")
	public User getUser() {
		return new User(1010L, "李新杰-get", "000000", new Date());
	}
	
	@PostMapping("/post")
	public User postUser(@RequestBody User user) {
		user.setUserName(user.getUserName() + "-post");
		return user;
	}
	
	@PutMapping("/put")
	public User putUser(@RequestBody User user) {
		user.setUserName(user.getUserName() + "-put");
		return user;
	}
	
	@DeleteMapping("/delete")
	public User deleteUser(@RequestBody User user) {
		user.setUserName(user.getUserName() + "-delete");
		return user;
	}
}
