package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, String> {

}
