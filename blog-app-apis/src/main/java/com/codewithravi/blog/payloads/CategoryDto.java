package com.codewithravi.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter 
public class CategoryDto {
		
	private Integer categoryId;
	
	@NotBlank
	@Size(min=4,message="Category Minimum size is 4 Character")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10,message="Description Minimum size is 10 character")
	private String categoryDescription;
}
