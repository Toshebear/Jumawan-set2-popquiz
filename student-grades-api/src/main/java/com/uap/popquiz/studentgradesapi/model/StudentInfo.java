package com.uap.popquiz.studentgradesapi.model;

public class StudentInfo {
	String studentid = ""; 
	String studentName = "";
	String comment = "";
	float averageGrade = 0;
	
	public String getStudentID() {
		return studentid;
	}
	public void setStudentID(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public float getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(float averageGrade) {
		this.averageGrade = averageGrade;
	}
}
