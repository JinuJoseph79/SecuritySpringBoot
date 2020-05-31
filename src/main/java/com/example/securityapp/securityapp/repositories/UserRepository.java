package com.example.securityapp.securityapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.securityapp.securityapp.entities.Users;


public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
