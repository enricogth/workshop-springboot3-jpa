package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

//it doesn't need to be a Spring component, because it extends JpaRepository, which is a Spring component
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
