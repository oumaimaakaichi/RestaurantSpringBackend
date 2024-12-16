package com.restaurant.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
