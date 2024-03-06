package com.codewithravi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithravi.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer>{

}
