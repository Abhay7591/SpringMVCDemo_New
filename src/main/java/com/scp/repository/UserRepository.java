package com.scp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scp.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
