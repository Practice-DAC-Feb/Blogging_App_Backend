package com.codewithravi.blog.services;

import java.util.List;

import com.codewithravi.blog.entities.Post;
import com.codewithravi.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	Post updatePost(PostDto postDto, Integer postId);
	
	//Delete
	void deletePost(Integer postId);
	
	//Get all post
	List<Post>getAllPost();
	
	//Get single Post
	Post getPostById(Integer postId);
	
	//Get all post by Category
	List<Post> getAllPostByCategory(Integer categoryId);
	
	//Get all post by User
	List<Post> getAllPostByUser(Integer userId);
	
	//Search posts
	List<Post>searchPosts(String keyword);

}	
