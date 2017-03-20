package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

//Attributes	
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private Double Grade;

//Don't know what to add to the private constructor since it's a noarg...	
	
	private Enrollment() 
	{
		
	}

//Setting Enrollment with StudentID and SectionID	
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();

	}

	public Double getGrade() {
		return Grade;
	}
//TODO - Change to Procedure?
	public void setGrade(Double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

}