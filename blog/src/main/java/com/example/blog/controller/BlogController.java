package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlog blogService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int createBlog(@RequestBody Blog blog) {
        blogService.createBlog(blog);
        return blog.getId();
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAll(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
