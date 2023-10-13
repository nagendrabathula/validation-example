package com.github.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.api.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
