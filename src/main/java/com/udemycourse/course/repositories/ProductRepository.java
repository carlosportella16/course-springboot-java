package com.udemycourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
