package com.github.adeniltonarcanjo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adeniltonarcanjo.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
