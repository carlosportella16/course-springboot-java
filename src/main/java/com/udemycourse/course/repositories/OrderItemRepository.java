package com.udemycourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
