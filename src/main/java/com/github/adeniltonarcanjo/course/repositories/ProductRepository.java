package com.github.adeniltonarcanjo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adeniltonarcanjo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
