package com.github.adeniltonarcanjo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adeniltonarcanjo.course.entities.Order;


public interface OrderRepository  extends JpaRepository<Order, Long>{

}
