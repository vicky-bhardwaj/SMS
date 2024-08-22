package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Attendance;
import com.dac.studentApp.model.AttendanceId;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, AttendanceId> {

}
