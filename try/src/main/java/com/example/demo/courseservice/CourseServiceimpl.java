package com.example.demo.courseservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.course.Courses;
import com.example.demo.coursedao.CourseDao;

@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceimpl() {}
	
	
	@Override
	public List<Courses> getCourses() {
		
		return courseDao.findAll();
	}

}
