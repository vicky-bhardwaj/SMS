package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
