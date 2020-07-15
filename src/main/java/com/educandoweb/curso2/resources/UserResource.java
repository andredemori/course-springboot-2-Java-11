package com.educandoweb.curso2.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso2.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAl(){
		User u = new User(1L, "Maria", "maria@gmail.com", "988182670", "12345");
		return ResponseEntity.ok().body(u);		
	}
}
