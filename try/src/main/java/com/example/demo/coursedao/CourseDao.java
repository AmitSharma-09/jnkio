package com.example.demo.coursedao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.course.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}