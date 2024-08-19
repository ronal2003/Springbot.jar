package com.ronal.spring.app.repository;

import com.ronal.spring.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

