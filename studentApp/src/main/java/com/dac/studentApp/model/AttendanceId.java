package com.dac.studentApp.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AttendanceId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rollNo;
    private LocalDate date;

    // Default constructor
    public AttendanceId() {}

    // Parameterized constructor
    public AttendanceId(int rollNo, LocalDate date) {
        this.rollNo = rollNo;
        this.date = date;
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

    // hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(rollNo, date);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AttendanceId that = (AttendanceId) obj;
        return rollNo == that.rollNo && Objects.equals(date, that.date);
    }
}
