package com.example.blog.dto;

import com.example.blog.model.Blog;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class BlogDto implements Serializable {
    private int id;
    private String titulo, nomeAutor, dataPublicacao;

    public BlogDto(Blog blog) {
        this.id = blog.getId();
    }

    public BlogDto(String titulo, String nomeAutor, String dataPublicacao) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.dataPublicacao = dataPublicacao;
    }
}
