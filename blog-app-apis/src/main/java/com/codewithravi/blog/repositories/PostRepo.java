package com.codewithravi.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithravi.blog.entities.Category;
import com.codewithravi.blog.entities.Post;
import com.codewithravi.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>  {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
