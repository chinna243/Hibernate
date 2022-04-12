package com.createiq.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
	
	public static void main(String [] args) {
		
		
		LocalDate date1= LocalDate.now();
		LocalTime time1=LocalTime.now();
		
		System.out.println(date1);
		System.out.println(time1);
	}

}
