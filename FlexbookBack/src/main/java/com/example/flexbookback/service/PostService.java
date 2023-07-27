package com.example.flexbookback.service;

import com.example.flexbookback.model.Posts;
import com.example.flexbookback.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public List<Posts> getAllPost(){
        return postRepository.findAll();
    }
}
