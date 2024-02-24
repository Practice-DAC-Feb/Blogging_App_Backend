package com.codewithravi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithravi.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
