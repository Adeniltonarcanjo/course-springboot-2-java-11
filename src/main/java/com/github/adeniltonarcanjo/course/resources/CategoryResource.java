package com.github.adeniltonarcanjo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.adeniltonarcanjo.course.entities.Category;
import com.github.adeniltonarcanjo.course.services.CategoryService;



@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryservice.findAll();			
		return ResponseEntity.ok().body(list) ;
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){		
		Category orderObj = categoryservice.findById(id);
		return ResponseEntity.ok().body(orderObj) ;
	}
}
