package com.langfundamentals;

public class Student {
	int StudentId;
	String StudentName;
	double StudentMarks;
	static int count = 0;
//	no arg+ no return type
	void getWelcome() {
		System.out.println("Welcome to student management system!!");
	}
//	arg + no return type	
	void getStudentDetails(int id,String name,double marks) {
		this.StudentId = id;
		this.StudentName = "name";
		this.StudentMarks = marks;
		System.out.println("getStudentDetails: "+id+"\n"+name+"\n"+marks+"\n");

	}
//	no arg + return type
	int getMarks() {
	   return 100;
	
	}
//	arg with return type
	int BonusMarks(int bonus) {
		return getMarks() + bonus;
		
	}
	static void CollegeName() {
		System.out.println("CDU");
	}
	static void StudentsCount() {
		System.out.println(count);
	}
	
	{
		count++;
	}
	
	
	
	
 
	 public static void main(String[] x) {
		 Student s = new Student();
		 System.out.println("Main method started!!");
		 s.getWelcome();
		 s.getStudentDetails(101,"Gayathri",100);
//	     static int res = getMarks();
//	     System.out.println(res);
	System.out.println(s.getMarks());
	     
	     System.out.println("Marks:"+s.getMarks() );
	     System.out.println(s.BonusMarks(10));
	     CollegeName();	
	     StudentsCount();
	 }
	

}
