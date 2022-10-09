package com.emp.wage;

public class Employee_Wage_Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage Computation Program");
		EmployeeWageProgram Emp = new EmployeeWageProgram();
		EmployeeWageProgram.computeEmpwage();
		Emp.displaymonthlySalary();
	}

}
