package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

//	private String Major;
	private UUID StudentID;
	private eMajor Major;
	
	public eMajor getMajor()
	{
		return Major;
	}
	
	public void setMajor(eMajor major)
	{
		Major = major;
	}
	
//	public String getMajor ( )
//    {
//        return this.Major;
//    }
//    public void setMajor (String Major)
//    {
//        this.Major = Major;    
//    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}