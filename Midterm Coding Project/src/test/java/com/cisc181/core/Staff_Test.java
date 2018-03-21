package com.cisc181.core;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {
	private static ArrayList<Staff> staff = new ArrayList<Staff>();

	
	@BeforeClass
	public static void setup() throws PersonException, Exception{

		double salary = 5000.00;
		for(int i = 0; i < 5; i++){
			staff.add(new Staff("Charles", "Henry", "Pearson", new Date(2000, 10, 1), "Newark,DE", "(302)-123-5739", "Example@udel.edu", "9AM-10AM", 3, salary, new Date(2000, 1, 17), eTitle.MR));
			salary += 100.00;
		}
	}
		
	
	@Test
	public void test(){

		double total = 0;
		for(Staff s: staff) {
			total += s.getSalary();
		}
		
		total = total/5;
		assertEquals(5200.00,total);
		
		try {
			Staff s1 = new Staff("Charles", "Henry", "Pearson", new Date(1000, 10, 1), "Newark,DE", "(302)-123-5739", "Example@udel.edu", "9AM-10AM", 3, 5000.00, new Date(2000, 1, 17), eTitle.MR);
		}catch(PersonException e) {
			System.out.println(e.getMessage());
		}
		

		try {
			Staff s1 = new Staff("Charles", "Henry", "Pearson", new Date(2000, 10, 1), "Newark,DE", "(302)-1234-5739", "Example@udel.edu", "9AM-10AM", 3, 5000.00, new Date(2000, 1, 17), eTitle.MR);
		}catch(PersonException e) {
			System.out.println(e.getMessage());
		}
	}
}
