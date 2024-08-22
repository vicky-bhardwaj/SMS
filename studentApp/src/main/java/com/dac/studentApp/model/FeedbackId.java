package com.dac.studentApp.model;


import java.io.Serializable;
import java.util.Objects;


public class FeedbackId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long PRN;
    private String teacherId;

    public FeedbackId() {
    }

    public FeedbackId(long PRN, String teacherId) {
        this.PRN = PRN;
        this.teacherId = teacherId;
    }

    public long getPRN() {
        return PRN;
    }

    public void setPRN(long PRN) {
        this.PRN = PRN;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedbackId that = (FeedbackId) o;
        return PRN == that.PRN &&
                Objects.equals(teacherId, that.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PRN, teacherId);
    }
}

