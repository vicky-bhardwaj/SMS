package com.dac.studentApp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(AttendanceId.class)
public class Attendance {

    @Id
    private int rollNo;

    @Id
    private LocalDate date;

    private boolean present;

    // Default constructor
    public Attendance() {}

    // Parameterized constructor
    public Attendance(int rollNo, LocalDate date, boolean present) {
        this.rollNo = rollNo;
        this.date = date;
        this.present = present;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
