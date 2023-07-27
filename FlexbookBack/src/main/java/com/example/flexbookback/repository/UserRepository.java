package com.example.flexbookback.repository;

import com.example.flexbookback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface UserRepository extends JpaRepository<User, Integer> {
   public User findUserByUsernameAndPassword(String name,String password);
}
