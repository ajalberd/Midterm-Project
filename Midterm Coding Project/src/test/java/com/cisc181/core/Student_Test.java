package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.Course;
import com.cisc181.core.Semester;
import com.cisc181.core.Section;
import java.util.UUID;

public class Student_Test {
	//ArrayLists must be static in order for the static method to modify them
	static ArrayList<Course> classes = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static Course cor1, cor2, cor3;
	static Student s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	
	@BeforeClass //Used for the arraylists
	public static void addData() throws PersonException {
		cor1 = new Course();
		cor1.setCourseID(UUID.randomUUID());
		cor1.setMajor(eMajor.COMPSI);
		cor1.setCourseName("Computer Science");
		cor1.setGradePoints(3);
		classes.add(cor1);

		cor2 = new Course();
		cor2.setCourseID(UUID.randomUUID());
		cor2.setMajor(eMajor.PHYSICS);
		cor2.setCourseName("Physics");
		cor2.setGradePoints(3);
		classes.add(cor2);

		cor3 = new Course();
		cor3.setCourseID(UUID.randomUUID());
		cor3.setMajor(eMajor.BUSINESS);
		cor3.setCourseName("Business");
		cor3.setGradePoints(2);
		classes.add(cor3);

		Semester x = new Semester();
		x.setSemesterID(UUID.randomUUID());
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.SEPTEMBER, 1);
		x.setStartDate(calendar.getTime());
		calendar.set(2017, Calendar.DECEMBER, 17);
		x.setEndDate(calendar.getTime());
		semester.add(x);

		x = new Semester();
		x.setSemesterID(UUID.randomUUID());
		calendar.set(2017, Calendar.FEBRUARY, 6);
		x.setStartDate(calendar.getTime());
		calendar.set(2017, Calendar.MAY, 21);
		x.setEndDate(calendar.getTime());
		semester.add(x);
		//adding semester and courses
		for (Semester s : semester) {
			for (Course c : classes) {
				Section sec2 = new Section();
				sec2.setSemesterID(s.getSemesterID());
				sec2.setRoomID(12);
				sec2.setCourseID(c.getCourseID());
				section.add(sec2);

				sec2 = new Section();
				sec2.setSemesterID(s.getSemesterID());
				sec2.setRoomID(13);
				sec2.setCourseID(c.getCourseID());
				section.add(sec2);
			}
		}

		//Making the 10 students, for ease of use only first name has been changed,
		
		calendar.set(1998, Calendar.JANUARY, 1);
		Student s1 = new Student("James","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s1);
		calendar.set(1994, Calendar.JANUARY, 12);
		s2 = new Student("Jafffmes","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s2);
		calendar.set(1995, Calendar.JANUARY, 12);
		s3 = new Student("Jamdsfes","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s3);
		calendar.set(1997, Calendar.JANUARY, 12);
		s4 = new Student("Jamesdsa","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s4);
		calendar.set(1996, Calendar.JANUARY, 12);
		s5 = new Student("Jamfdses","007","Bond", calendar.getTime(), eMajor.COMPSI, "sdfsdfsdfd", "(555)-555-5555", "email@fake");
		student.add(s5);
		calendar.set(1998, Calendar.JANUARY, 12);
		s6 = new Student("Jaasdmes","007","Bond", calendar.getTime(), eMajor.COMPSI, "dsafsdfadas", "(555)-555-5555", "email@fake");
		student.add(s6);
		calendar.set(1995, Calendar.JANUARY, 12);
		s7 = new Student("Jamfdses","007","Bond", calendar.getTime(), eMajor.COMPSI, "asdfsdfafsa", "(555)-555-5555", "email@fake");
		student.add(s7);
		calendar.set(1998, Calendar.JANUARY, 12);
		s8 = new Student("Jamsadfes","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s8);
		calendar.set(1999, Calendar.JANUARY, 12);
		s9 = new Student("Jamsdafases","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s9);
		calendar.set(1997, Calendar.JANUARY, 12);
		s10 = new Student("Jamffffes","007","Bond", calendar.getTime(), eMajor.COMPSI, "123 Park Place", "(555)-555-5555", "email@fake");
		student.add(s10);
		calendar.set(1985, Calendar.JANUARY, 12);	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}