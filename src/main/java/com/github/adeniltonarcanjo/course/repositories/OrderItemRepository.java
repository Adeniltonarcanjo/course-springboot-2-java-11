package com.github.adeniltonarcanjo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adeniltonarcanjo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
