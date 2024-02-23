package com.codewithravi.blog.exceptions;

public class MethodArgumentNotValidException extends RuntimeException{

	String methodArgumentName;
	
	
	public MethodArgumentNotValidException(String methodArgumentName) {
		super(String.format("%s argument is not valid ",methodArgumentName));
		this.methodArgumentName=methodArgumentName;
		
		
	}
	
	
}