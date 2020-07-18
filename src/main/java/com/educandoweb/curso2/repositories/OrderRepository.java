package com.educandoweb.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
