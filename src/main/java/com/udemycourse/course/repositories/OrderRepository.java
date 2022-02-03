package com.udemycourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
