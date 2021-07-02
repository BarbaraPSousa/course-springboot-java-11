package com.educandoweb.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController//informa que é controlado por um controlador rest
@RequestMapping(value = "/users")//nome do recurso
public class UserResouce {

	@GetMapping//
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "maria@gmail.com", "99999999","1236549");
		return ResponseEntity.ok().body(u);
	}
}
