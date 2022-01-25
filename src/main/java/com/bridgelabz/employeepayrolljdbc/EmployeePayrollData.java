package com.bridgelabz.employeepayrolljdbc;

import java.time.LocalDate;

public class EmployeePayrollData {
	public int Id;
	public String Name;
	public double Salary;
	public LocalDate startDate;
	
	public EmployeePayrollData(Integer id, String name, Double salary) {
		
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
	}
	
	public EmployeePayrollData(Integer id, String name, Double salary, LocalDate startDate) {
		this(id,name,salary);
		this.startDate = startDate;
	}
	
	@Override
	public String toString() {
		
		return "EmployeeId: "+Id+", EmployeeName: "+Name+", EmployeeSalary: "+Salary;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object)
			return true;
		if(object == null || getClass() != object.getClass())
			return false;
		EmployeePayrollData that = (EmployeePayrollData) object;
		return Id == that.Id && Double.compare(that.Salary,  Salary) == 0 && Name.equals(that.Name);
	}
}