package com.educandoweb.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso2.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	

}
