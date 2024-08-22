package com.dac.studentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Feedback;
import com.dac.studentApp.repository.FeedbackRepo;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepo feedbackRepository;

	public void saveFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
		
	}

	public List<Feedback> getTeacher(String teacherId) {
		
		return feedbackRepository.getTeacher(teacherId);
	}

	public double getAvgRating(String teacherId) {
		double total=0;
		int count=0;
		for(Feedback teacher : getTeacher(teacherId)) {
			total+=teacher.getRating();
			count++;
		}
		return (total/count);
	}

}
