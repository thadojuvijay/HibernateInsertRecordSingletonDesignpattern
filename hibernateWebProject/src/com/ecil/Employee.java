package com.ecil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Emp_tble",schema="BMS")
public class Employee {

	
	@Id
	@SequenceGenerator(name="EMP_SEQ",sequenceName="EMP_SEQ",allocationSize=1)
	@GeneratedValue(generator="EMP_SEQ",strategy=GenerationType.SEQUENCE)
private Integer eno;
private String name;
private Double Salary;



public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}

	}


