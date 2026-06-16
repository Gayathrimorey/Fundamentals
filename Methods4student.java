package com.langfundamentals;
class Studentt{
	int id;
	String name;
	double marks;
	
	String address;
	String organization;
	String course;
	
}

public class Methods4student {
	Studentt getStudentInf() {
		Studentt s = new Studentt();
		s.id = 101;
		s.name = "Gayathri";
		s.marks = 95;
		s.address = "Kadapa dt pml";
		s.organization = "Vcube";
		s.course = "JFS";
		return s;
	}

	void main() {
		System.out.println("Main method started!!");

		Studentt s = getStudentInf();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.address);
		System.out.println(s.organization);
		System.out.println(s.course);
		System.out.println("Main method ended!!");
	

	} 
}
