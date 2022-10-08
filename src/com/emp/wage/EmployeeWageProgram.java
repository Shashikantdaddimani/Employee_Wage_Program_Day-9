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
		 for(int i=1; i<monthlyWorkingDays;i++) {
		int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		
		case 1:
			System.out.println("Employee is working fullday");
			salary = wagePerHour * fullDayHours;
			break;
		
		case 2:
			System.out.println("Employee is working Halfday");
			salary = wagePerHour * halfDayHours;
		}
		System.out.println("Salary is: "+salary);
		monthlySalary = monthlySalary +salary;
	}
		 System.out.println("Monthly Salary: "+monthlySalary);
}
}
