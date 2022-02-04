package com.udemycourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
