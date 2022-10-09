package com.emp.wage;

import java.util.*;

public class EmployeeWageProgram {

//	public static void main(String[] args) {
//		System.out.println("Welcome to the Employee wage Computation Program");
		
		
		static int wagePerHour=20;
		static int fullDayHours=8;
		static int halfDayHours=4;
		static int salary = 0;
		static int monthlySalary = 0;
		static int monthlyWorkingDays = 20;
		static int days = 0;
		static int monthlyHours = 0;
		 
		static void computeEmpwage() {
			
			Random random = new Random();
		
		    while(days!=20 && monthlyHours!=100) {
			 
		    	days++;
			 int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		
		case 1:
			System.out.println("Employee is working fullday");
			salary = wagePerHour * fullDayHours;
			monthlyHours = monthlyHours + fullDayHours;
			break;
		
		case 2:
			System.out.println("Employee is working Halfday");
			salary = wagePerHour * halfDayHours;
			monthlyHours = monthlyHours + halfDayHours;
		}
		
		monthlySalary = monthlySalary +salary;
		System.out.println("Days"+ days + "Salary is: "+salary);
	}
		 System.out.println("Monthly Salary: "+monthlySalary);
}
		  void displaymonthlySalary() {
			System.out.println("Monthly salary: "+monthlySalary);
		}
}
	
	