package com.codewithravi.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.codewithravi.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min=4, max=20,message="Username must be min of 4 and max of 20 characters!!")
	private String name;
	
	@NotEmpty
	@Email(message="Email address is not valid!!")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message="Password must be of length min 3 and max 10 chars!! ")
	private String password;
	
	@NotEmpty(message="About field should not be empty")
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

	
		
}
