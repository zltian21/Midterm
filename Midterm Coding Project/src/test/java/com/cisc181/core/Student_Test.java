package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> Course = new ArrayList<Course>();
	static ArrayList<Semester> Semester = new ArrayList<Semester>();
	static ArrayList<Section> Section = new ArrayList<Section>();
	static ArrayList<Student> Student = new ArrayList<Student>();
	static ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws PersonException, ParseException {
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date sem1S = sdf.parse("08/12/2016"); 
		Date sem1E = sdf.parse("12/16/2016");
		Date sem2S = sdf.parse("2/6/2017");
		Date sem2E = sdf.parse("5/31/2018");
		Date bir = sdf.parse("5/23/1999");
		
		Semester.add(new Semester(sem1S, sem1E));
		Semester.add(new Semester(sem2S, sem2E));
		
		Course.add(new Course("PHYS207", 100, eMajor.PHYSICS));
		Course.add(new Course("CISC106", 100, eMajor.COMPSI));
		Course.add(new Course("CHEM102", 100, eMajor.CHEM));
		
		Section.add(new Section());
		Section.add(new Section());
		Section.add(new Section());
		Section.add(new Section());
		
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.PHYSICS, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.CHEM, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.COMPSI, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.CHEM, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.COMPSI, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.PHYSICS, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.COMPSI, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.PHYSICS, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		Student.add(new Student("John", "K", "Mickael", bir, eMajor.COMPSI, "Newark,DE", "(302)-123-2354", "Example@udel.edu"  ));
		
		
	}

	@Test
	public void test() {
		for(Student s: Student) {
			if(s.getMajor() == eMajor.CHEM) {
				Enrollment.add(new Enrollment(s.getStudentID(), ));
			}
		}
		
	}
}