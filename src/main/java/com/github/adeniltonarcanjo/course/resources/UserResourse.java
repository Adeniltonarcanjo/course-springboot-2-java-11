package com.github.adeniltonarcanjo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.adeniltonarcanjo.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u= new User(1L, "joão", "j@gmail.com","999","1234");
		
		return ResponseEntity.ok().body(u);
	}

}
