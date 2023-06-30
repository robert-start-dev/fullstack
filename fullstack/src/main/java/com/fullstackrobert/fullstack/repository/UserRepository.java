package com.fullstackrobert.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackrobert.fullstack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
