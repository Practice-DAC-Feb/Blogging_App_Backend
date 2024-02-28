package com.codewithravi.blog.services;

import java.util.List;

import com.codewithravi.blog.entities.Post;
import com.codewithravi.blog.payloads.PostDto;
import com.codewithravi.blog.payloads.PostResponse;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete
	void deletePost(Integer postId);
	
	//Get single Post
	PostDto getPostById(Integer postId);
	
	//Get all post by Category
	List<PostDto> getAllPostByCategory(Integer categoryId);
	
	//Get all post by User
	List<PostDto> getAllPostByUser(Integer userId);
	
	//Search posts
	List<Post>searchPosts(String keyword);

	
	//Get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy,String sortDir);
}	
