package com.bridgelabz.employeepayrolljdbc;

import java.time.LocalDate;

public class EmployeePayrollData {
	public int Id;
	public String Name;
	public double Salary;
	public LocalDate startDate;

	public EmployeePayrollData(Integer id, String name, Double salary, LocalDate date) {

		this.Id = id;
		this.Name = name;
		this.Salary = salary;
		this.startDate = date;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", startDate=" + startDate
				+ "]";
	}

}