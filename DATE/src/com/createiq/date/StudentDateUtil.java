package com.createiq.date;

import java.util.Date;

public class StudentDateUtil {
	
	public long coursePeriod(Date startingDate,Date presentDate) {
		
		long periodOfDays=(startingDate.getTime()-presentDate.getTime());
		return Math.abs(periodOfDays);
	}

}
