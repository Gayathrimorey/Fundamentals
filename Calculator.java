package com.langfundamentals;
import java.util.Scanner;


public class Calculator {
	void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 : ");
		
		int a = sc.nextInt();
		System.out.println("enter number 2 : ");
		int b = sc.nextInt();
		System.out.println("enter the third number:");
		int c = sc.nextInt();
		System.out.println("Addition of two numbers :"+ (a+b+c));
	
	} 
	
  
	 void main() {
	 System.out.println(" Welcome to Calculator !");
		addition();
	
		
		add(5,20);	
		addi(30,100,140);
	

	}
	 void add(int a, int b) {
		 System.out.println("Addition of two numbers :"+ (a+b));
	 }

	 
	 void addi (int x,int y,int z) {
		 System.out.println("Addition of two numbers :"+ (x+y+z));
		 
	 }
}
