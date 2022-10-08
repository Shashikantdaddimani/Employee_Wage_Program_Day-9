package com.emp.wage;

import java.util.Random;

public class EmployeeWageProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage Computation Program");
		
		Random random = new Random();
		int wagePerHour=20;
		int fullDayHours=8;
		int halfDayHours=4;
		int salary = 0;
		int monthlySalary = 0;
		int monthlyWorkingDays = 20;
		int days = 0;
		int monthlyHours = 0;
		
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
}
