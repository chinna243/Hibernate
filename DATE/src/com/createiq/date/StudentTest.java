package com.createiq.date;

import java.util.Calendar;
import java.util.Date;

public class StudentTest {
	
	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.setEid(11213);
		student.setName("saikumar");
		student.setFee(30000);
		Date date;
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 00, 05);
		date = cal.getTime();
		System.out.println(date);
		student.setCourseStartDate(date);
		StudentDateUtil dateUtil = new StudentDateUtil();
		Date today = Calendar.getInstance().getTime();
		System.out.println(today);
		long days = dateUtil.coursePeriod(today, date);

		System.out.println("student Id :" + student.getEid());
		System.out.println("student Name:" + student.getName());
		System.out.println("student fee :" + student.getFee());
		System.out.println("student courseStartingDate :" + student.getCourseStartDate());
		System.out.println("number of days :" + days);
		
	}

}
