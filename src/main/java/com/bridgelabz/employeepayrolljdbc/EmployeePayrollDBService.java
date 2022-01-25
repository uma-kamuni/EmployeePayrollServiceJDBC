package com.bridgelabz.employeepayrolljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollDBService {
	
	private Connection getConnection() throws SQLException {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll?useSSL=false";
		String userName = "root";
		String password = "@Sanaya1444";
		Connection connection;
		
		System.out.println("Connecting to the database : "+jdbcURL);
		connection = DriverManager.getConnection(jdbcURL, userName, password);
		System.out.println("Connection is Succcessfully Established!! "+connection);
		
		return connection;
	}
	
	public List<EmployeePayrollData> readData(){
		
		String sqlStatement = "SELECT * FROM employee_payroll;";     
		List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
				
		try (Connection connection = getConnection();){
			java.sql.Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlStatement);
			
			while(resultSet.next()) {
				int id = resultSet.getInt("Id");
				String name = resultSet.getString("Name");
				double salary = resultSet.getDouble("salary");
				LocalDate startDate = resultSet.getDate("start").toLocalDate();
				employeePayrollList.add(new EmployeePayrollData(id, name, salary, startDate));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return employeePayrollList;
	}
}