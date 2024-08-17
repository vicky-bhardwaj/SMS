package com.dac.studentApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Assignments;

@Repository
public interface AssignmentsRepo extends JpaRepository<Assignments, Integer> {

}
