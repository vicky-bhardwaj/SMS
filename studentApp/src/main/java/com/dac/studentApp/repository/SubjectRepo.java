package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
