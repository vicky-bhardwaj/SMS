package com.dac.studentApp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Attendance;
import com.dac.studentApp.model.StudentAttendance;
import com.dac.studentApp.repository.AttendanceRepo;
import com.dac.studentApp.repository.StudentAttendanceRepo;


@Service
public class AttendanceService {

	 @Autowired
	    private AttendanceRepo attendanceRepository;
	 @Autowired
	 	private StudentAttendanceRepo saRepository;

	    public void saveAttendance(Map<Integer, Boolean> attendanceMap, LocalDate date) {
	    	List<Integer>rollList= new ArrayList<>();
	        for (Map.Entry<Integer, Boolean> entry : attendanceMap.entrySet()) {
	            int rollNo = entry.getKey();
	            boolean present = entry.getValue();
	            Attendance attendance = new Attendance(rollNo, date, present);
	            attendanceRepository.save(attendance);
	            rollList.add(rollNo);
	        }
	        updateAttendance(rollList);
	    }
	    
	    public void updateAttendance(List<Integer>rollList) {
	    	List<StudentAttendance> saList=saRepository.findAll();
	    	for(int rollNo : rollList) {
	    		StudentAttendance saObject=saRepository.getOne(rollNo);
	    		saObject.setPresent(saObject.getPresent()+1);	
	    	}
	    	
	    	for(StudentAttendance student :saList)
	    	{
	    		student.setTotalSessions(student.getTotalSessions()+1);
	    		student.setPercentage(student.getPresent()*100/student.getTotalSessions());
	    		
	    		saRepository.save(student);
	    	}
	    	
	    }

		public void addNew(StudentAttendance sa) {
			saRepository.save(sa);
			
		}

		public void delete(StudentAttendance sa) {
			saRepository.delete(sa);
			
		}

		public StudentAttendance getOne(int rollNo) {
			return saRepository.findById(rollNo).orElse(null);
			
		}

		public List<Attendance> getDates(int rollNo) {
			
			return saRepository.getDatesPresent(rollNo);
		}
}
