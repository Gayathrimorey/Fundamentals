package com.langfundamentals;

//methods with no arguments with return type
public class NoArgWithReturn {
	void main () {
		System.out.println("Main method started!!");
		
		double totalSalary = getSalaryInfo();
		double bon=  getBonus();
		System.out.println("totalSalary:" +(totalSalary+ bon));
		System.out.println("Main method ended!!");
		
	}
	
	double getBonus() {
		double Bonus = 30000.00;
		return Bonus;
	}
	
	double getSalaryInfo() {
		double totalSalary = 0;
		double sal = 100000.00;
		double hra  = 6400.00;
		totalSalary = sal+hra;
		
		return totalSalary;
	}
	
	
}





