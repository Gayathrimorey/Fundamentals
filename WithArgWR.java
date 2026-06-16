package com.langfundamentals;

import java.util.Scanner;

public class WithArgWR {

	
		 void main() {				
			System.out.println("Main method started!");
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter full name:");
				String name = sc.nextLine();
				getname(name);
				System.out.println("Enter your height:");
				float height = sc.nextFloat();
				height(height);
		 }
				
		
	
			void getname(String name) {
				System.out.println("enter a name:" + name );
			}
			void height(float height) {
				System.out.println("enter your height:" + height);
			}

	}


