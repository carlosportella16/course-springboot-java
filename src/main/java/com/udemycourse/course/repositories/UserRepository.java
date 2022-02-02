package com.udemycourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
