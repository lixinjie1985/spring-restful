package org.eop.spring.restful.controller;

import java.util.List;

import org.eop.spring.restful.result.RestResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
@RequestMapping(path = "/user", consumes = {})
@RestController
public class UserController {

	
	@GetMapping("/add")
	public RestResult<String> addUser1() {
		return new RestResult<String>();
	}
	
	@PostMapping("/add")
	public RestResult<String> addUser() {
		return new RestResult<String>();
	}
	
	@GetMapping("/list")
	public RestResult<List<String>> listUsers() {
		return new RestResult<List<String>>();
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public RestResult<String> editUser1() {
		return new RestResult<String>();
	}
	
	@PutMapping("/edit")
	public RestResult<String> editUser() {
		return new RestResult<String>();
	}
	
	@DeleteMapping("/delete/{id:\\d+}")
	public RestResult<String> deleteUser() {
		return new RestResult<String>();
	}
}
