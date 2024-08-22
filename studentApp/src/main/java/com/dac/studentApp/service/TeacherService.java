package com.dac.studentApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.repository.TeacherRepo;

@Service
public class TeacherService {


	@Autowired
	private TeacherRepo teacherRepository;
	
	
	public List<Teacher> getAll() {
		return (List<Teacher>) teacherRepository.findAll();
	}

	
	public Teacher getOne(String teacherId) {
		return teacherRepository.findById(teacherId).orElse(null);
	}

	public void addNew(Teacher teacher) {
		teacherRepository.save(teacher);
	}
	
	public void update(Teacher teacher) {
		teacherRepository.save(teacher);
	}
	
	public void delete(String teacherId) {
		teacherRepository.deleteById(teacherId);
	}
	
	public boolean validateLogin(Teacher teacher) {
		
		return teacherRepository.validateLogin(teacher.getTeacherId(),teacher.getPassword());
	}
}
