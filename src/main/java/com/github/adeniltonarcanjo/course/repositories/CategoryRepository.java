package com.github.adeniltonarcanjo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adeniltonarcanjo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
