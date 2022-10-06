package com.emp.wage;

import java.util.Random;

public class EmployeeWageProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage Computation Program");
		
		Random random = new Random();
		int randomNum = random.nextInt(2);
		
		if (randomNum==0) 
		{
			System.out.println("Emloyee is Present");
			
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}

}
