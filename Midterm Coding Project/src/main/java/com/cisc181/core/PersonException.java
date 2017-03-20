package com.cisc181.core;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.core.Person;

public class PersonException extends Exception{

	private Person Person;
	private Date DOB;
	private String phonenumber;

	public PersonException(Person Person){
		this.Person = Person;
	}
	public PersonException(PersonException personException) 
	{
	//Constructor for PersonException
	}
	//getters for Person and DOB
	public String getPerson(String Person) {
		return Person;
	}
	public Date getDOB() {
		return DOB;
	}
	
	public void setDOB(Date DOB) throws PersonException {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, 100);
		if (date.getTime().before(DOB)) {
			throw new PersonException(this);
		}
		this.DOB = DOB;
	}
	
}	