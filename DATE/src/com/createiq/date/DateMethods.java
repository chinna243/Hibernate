package com.createiq.date;

import java.util.Date;

public class DateMethods {
	
	public static void main(String[] args) {
		
		Date d=new Date(2021,11,12);
		System.out.println(d);
		Date d2=new Date(2021, 11,12);
		System.out.println(d2);
		System.out.println("date d1 is after d2 is " +d.after(d2));
		System.out.println("date d1 is before d2 is " +d.before(d2));
		System.out.println("date d1 is compare to d2 is " +d2.compareTo(d));
		System.out.println("date d1 is equals to d2 is " +d.equals(d2)); //two date are equlas  it return true
		System.out.println("time is " +d.getTime());
		System.out.println("date is  " +d.getDate());
		System.out.println("year is" +d.getYear());
		
	}

}
