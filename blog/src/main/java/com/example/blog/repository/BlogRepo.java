package com.example.blog.repository;

import com.example.blog.model.Blog;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BlogRepo {
    private final String linkFile = "src/main/resources/blogs.json";
    ObjectMapper mapper = new ObjectMapper();

    public void createBlog(Blog newBlog) {
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Blog> blogs = getAll();

        blogs = new ArrayList<>(blogs);

        blogs.add(newBlog);

        try {
            writer.writeValue(new File(linkFile), blogs);
        }catch (Exception ex) {
            System.out.println("Não foi possível acessar o arquivo.");
        }
    }

    public List<Blog> getAll(){
        List<Blog> blogs = null;
        try {
            blogs = Arrays.asList(mapper.readValue(new File(linkFile), Blog[].class));
        } catch (Exception e){
            System.out.println("Não foi possível ler o arquivo.");
        }
        return blogs;
    }

    public void getOneBlog(){
        List<Blog> blogs = getAll();
    }
}
