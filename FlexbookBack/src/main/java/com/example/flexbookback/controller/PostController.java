package com.example.flexbookback.controller;

import com.example.flexbookback.model.Posts;
import com.example.flexbookback.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping("/listpost")
    public List<Posts> findAllPost(){
        return  postService.getAllPost();
    }
}
