package com.example.ex2.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ex2.model.Course;
import java.util.List;


@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{

    List<Course> findByCourseName(String courseName);
    
}
