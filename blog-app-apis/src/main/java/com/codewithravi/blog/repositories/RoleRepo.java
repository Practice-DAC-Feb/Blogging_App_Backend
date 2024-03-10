package com.codewithravi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithravi.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
