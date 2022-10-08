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
		
		int randomNum = random.nextInt(3);
		
		if (randomNum==1) 
		{
			System.out.println("Emloyee is Present");
			salary = wagePerHour * fullDayHours;
		}
		else if(randomNum == 2)
		{
			salary = wagePerHour * halfDayHours;
		}
		else
		{
			System.out.println("Employee is Absent");
		}	
		System.out.println("Salary is:"+salary);
	}

}
