package com.github.adeniltonarcanjo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.adeniltonarcanjo.course.entities.Category;
import com.github.adeniltonarcanjo.course.entities.Order;
import com.github.adeniltonarcanjo.course.repositories.CategoryRepository;
import com.github.adeniltonarcanjo.course.repositories.OrderRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();

	}

}
