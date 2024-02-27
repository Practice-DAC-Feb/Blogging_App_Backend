package com.codewithravi.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithravi.blog.payloads.ApiResponse;
import com.codewithravi.blog.payloads.PostDto;
import com.codewithravi.blog.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	
	@Autowired
	private PostService postService;
	
//---------------------------------------------------------------------------------------------------------	
	//create new Post
	@RequestMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(
			@RequestBody PostDto postDto,
			@PathVariable Integer userId,
			@PathVariable Integer categoryId
			) 
	{
		PostDto createPost = this.postService.createPost(postDto, userId, categoryId);
		return new ResponseEntity<PostDto>(createPost,HttpStatus.CREATED);
	}

//-----------------------------------------------------------------------------------------------------------------
	//Get By User
	
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>> getAllPostByUser(@PathVariable Integer userId)
	{
		List<PostDto> posts=this.postService.getAllPostByUser(userId);
		
		return new ResponseEntity<List<PostDto>>(posts,HttpStatus.OK);
	}
//---------------------------------------------------------------------------------------------------------------------
	//Get Post By Category
	
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>> getAllPostsBycategory(@PathVariable Integer categoryId)
	{
		List<PostDto> posts=this.postService.getAllPostByCategory(categoryId);
		
		return new ResponseEntity<List<PostDto>>(posts,HttpStatus.OK);
	}
//--------------------------------------------------------------------------------------------------------------------
	//Get All posts
	@GetMapping("/posts")
	public ResponseEntity <List<PostDto>> getAllPost()
	{
		 List<PostDto> allPost= this.postService.getAllPost();
		return new ResponseEntity<List<PostDto>>(allPost,HttpStatus.OK);
	}
//----------------------------------------------------------------------------------------------------------------------
	//Get Post by ID
	@GetMapping("/posts/{postId}")
	public ResponseEntity <PostDto> getPostById(@PathVariable Integer postId)
	{
		PostDto postDto = this.postService.getPostById(postId);
		return new ResponseEntity<PostDto>(postDto, HttpStatus.OK);
		
	}
//-----------------------------------------------------------------------------------------------------------------------
	//Delete Post by ID
		@DeleteMapping("/posts/{postId}")
		public ApiResponse deletePost(@PathVariable Integer postId)
		{
			 this.postService.deletePost(postId);
			 return new ApiResponse("Post is successfully Deleted",true);
		}
//-------------------------------------------------------------------------------------------------------------------------
	//Update Post by ID
		@PutMapping("/posts/{postId}")
		public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId)
		{
			PostDto updatedPost = this.postService.updatePost(postDto,postId);
			 return new ResponseEntity<PostDto>(updatedPost,HttpStatus.OK);
		}		
		
}