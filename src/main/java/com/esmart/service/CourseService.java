package com.esmart.service;

import java.util.List;

import com.esmart.model.Course;

public interface CourseService {
	public String upsert(Course course);
	public Course getById(Integer cId);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);

}
