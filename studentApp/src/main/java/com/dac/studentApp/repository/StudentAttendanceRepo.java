package com.dac.studentApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Attendance;
import com.dac.studentApp.model.StudentAttendance;

@Repository
public interface StudentAttendanceRepo extends JpaRepository<StudentAttendance, Integer> {

	@Query("SELECT a FROM Attendance a WHERE a.rollNo = :rollNo")
	List<Attendance> getDatesPresent(int rollNo);

}
