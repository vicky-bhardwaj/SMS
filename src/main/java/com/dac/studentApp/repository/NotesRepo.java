package com.dac.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.studentApp.model.Notes;

@Repository
public interface NotesRepo extends JpaRepository<Notes, Integer>{

}
