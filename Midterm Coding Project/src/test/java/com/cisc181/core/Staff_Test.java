package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;
import org.junit.AfterClass;
import com.cisc181.core.Course;
import com.cisc181.core.Semester;
import com.cisc181.core.Section;
import java.util.UUID;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSalary() {
		static ArrayList<Staff> staff = new ArrayList<Staff>();
		static ArrayList salary = new ArrayList();
		Staff sal1,sal2,sal3,sal4,sal5;
		calendar.set(1998, Calendar.JANUARY, 12);
		Staff sal1 = new Staff("Jamessda","007","Bond", calendar.getTime(), "123 Park Place", "(555)-555-5555", "email@fake", "thisdate", 2, 200000.00, calendar.getTime(), eTitle.MR);
		staff.add(sal1);
		Staff sal2 = new Staff("James","007","Bond", calendar.getTime(), "123 Park Place", "(555)-555-5555", "email@fake", "thisdate", 2, 200000.00, calendar.getTime(), eTitle.MR);
		staff.add(sal2);
		Staff sal3 = new Staff("Jasdames","007","Bond", calendar.getTime(), "123 Park Place", "(555)-555-5555", "email@fake", "thisdate", 2, 200000.00, calendar.getTime(), eTitle.MR);
		staff.add(sal3);
		Staff sal4 = new Staff("Jamdsades","007","Bond", calendar.getTime(), "123 Park Place", "(555)-555-5555", "email@fake", "thisdate", 2, 200000.00, calendar.getTime(), eTitle.MR);
		staff.add(sal4);
		Staff sal5 = new Staff("Jamdasdaes","007","Bond", calendar.getTime(), "123 Park Place", "(555)-555-5555", "email@fake", "thisdate", 2, 200000.00, calendar.getTime(), eTitle.MR);
		staff.add(sal5);
		sal1.setSalary(200000);
		sal2.setSalary(120000);
		sal3.setSalary(150000);
		sal4.setSalary(80000);
		sal5.setSalary(60000);
		Salary.add(sal1);
		Salary.add(sal2);
		Salary.add(sal3);
		Salary.add(sal4);
		Salary.add(sal5);
		
		double proof = 200000 + 120000 + 150000 + 80000 + 60000;
		proof = proof / 5;
		
		double average = 0;
		for (Staff x : Salary){
			average += x.getSalary() / Salary.size();
		}
		
		assertEquals(average, proof,0);
		//There's an error with the equals function, despite using it right...
	}	

	@Test(expected = PersonException.class) //From Piazza
	public void TestInvalidDOB() throws PersonException {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, 101); //Limit is 100
		Staff stf = new Staff(eTitle.MR);
		stf.setDOB(date.getTime());
	}
}
