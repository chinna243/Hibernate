package com.createiq.date;

import java.util.Date;

public class Student {
	
	private int eid;
	private String name;
	private double fee;
	private Date courseStartDate;
	
	public Student() {
		
		
	}

	public Student(int eid, String name, double fee, Date courseStartDate) {
		super();
		this.eid = eid;
		this.name = name;
		this.fee = fee;
		this.courseStartDate = courseStartDate;
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	/**
	 * @return the courseStartDate
	 */
	public Date getCourseStartDate() {
		return courseStartDate;
	}

	/**
	 * @param courseStartDate the courseStartDate to set
	 */
	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", fee=" + fee + ", courseStartDate=" + courseStartDate + "]";
	}
	
	
	
	
	

}
