package com.rvce.library_jmanagement.repository;

import com.rvce.library_jmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}