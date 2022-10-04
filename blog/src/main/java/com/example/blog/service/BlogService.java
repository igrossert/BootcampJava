package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlog{

    @Autowired
    private BlogRepo blogRepo;
    @Override
    public void createBlog(Blog blog) {
        blogRepo.createBlog(blog);
    }
}
