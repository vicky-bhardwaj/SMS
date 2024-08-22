package com.dac.studentApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Feedback;
import com.dac.studentApp.model.FeedbackId;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, FeedbackId> {

	@Query("SELECT a FROM Feedback a WHERE a.teacherId = :teacherId")
	List<Feedback> getTeacher(String teacherId);
	

}
