package com.educandoweb.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.curso2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
