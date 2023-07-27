package com.example.flexbookback.repository;

import com.example.flexbookback.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts,Integer> {
}
