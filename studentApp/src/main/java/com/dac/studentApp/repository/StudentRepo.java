package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
	 @Query("SELECT CASE WHEN COUNT(s) > 0 THEN true ELSE false END FROM Student s WHERE s.PRN = :prn AND s.password = :pass")
	 boolean validateLogin(long prn,String pass);

	 @Query("SELECT s FROM Student s WHERE s.PRN = :prn")
	 Student getByPRN(long prn);
}
