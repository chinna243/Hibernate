package com.createiq.demo;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="employee_tab")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Employee {
	
	
	 @Id  
	 private int eid; 
	
	 private String ename;    
	 private float esal;
	 
	 
	 
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, float esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	 
	
	 
	 
	 
	     
	
	

}
