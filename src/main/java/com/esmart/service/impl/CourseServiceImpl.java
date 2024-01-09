package com.esmart.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.esmart.model.Course;
import com.esmart.repo.CourseRepository;
import com.esmart.service.CourseService;

public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	@Override
	public String upsert(Course course) {
		
		courseRepo.save(course); // working for both update & insert record based on PK
		
		return "Success !!";
	}

	@Override
	public Course getById(Integer cId) {
		Optional<Course> findById = courseRepo.findById(cId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Deleted Successfully...!!";
		}else
		   return "No Record Found !!";
	}

}
