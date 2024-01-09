package com.esmart.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esmart.model.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	

}
