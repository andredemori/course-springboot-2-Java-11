package com.educandoweb.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
