package com.codewithravi.blog.services;


import java.util.List;

import com.codewithravi.blog.entities.Category;
import com.codewithravi.blog.payloads.CategoryDto;

public interface CategoryService {


	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update     
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId );
	
	
	//delete
	 void deleteCategory(Integer categoryId);
	
	 //get
	CategoryDto getCategory(Integer categoryId);
	
	//get All
	List<CategoryDto> getCategories();
	
	
}