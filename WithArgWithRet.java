package com.langfundamentals;

import java.util.Scanner;

public class WithArgWithRet {
	static Scanner sc = new Scanner(System.in);
	
	 void main() {
		
		
		
		

		double Salary = getSalary();
		double Bonus = getBonus();
		double GST= getGST();
		System.out.println("Total salary:"+(Salary+Bonus+GST));
		
	 }
		double getSalary() {
			System.out.println("Enter salary:");
			double sal = sc.nextDouble();
			return sal;
			
		}
		double getBonus() {
			System.out.println("Enter Bonus:");
			double bonus = sc.nextDouble();
			return bonus;
			
		}
		double getGST() {
			System.out.println("Enter gst:");
			double GST = sc.nextDouble();
			return GST;
			
		}
		

	}

	 
	
