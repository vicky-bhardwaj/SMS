package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, String> {

	 @Query("SELECT CASE WHEN COUNT(t) > 0 THEN true ELSE false END FROM Teacher t WHERE t.teacherId = :tId AND t.password = :pass")
	 boolean validateLogin(String tId,String pass);
}
