package com.langfundamentals;

import java.util.Scanner;

//with arguments no return types
public class StudentInfo {
	
	void getRollNo(int R) {
		System.out.println("RollNo:"+ R);
		
	}
	
	void getName(String N) {
		System.out.println("Name:"+ N);
		
	}
	void getAge(int A ) {
		System.out.println("Age:"+ A);
		
	}
	void getGender (char G) {
		System.out.println("Gender:"+ G);
		
	}
	void getCourse (String C) {
		System.out.println("Course:"+ C);
	}
	void getMobile_Number(long M) {
		System.out.println("Mobile_Number:"+ M);
	}
	void getPermanentAddress(String Padr) {
		System.out.println("PermanentAddress:"+ Padr);
	}
	void getEmail(String E) {
		System.out.println("Email:"+ E);
	}
	void getDepartment (String D) {
		System.out.println("Department:"+ D	);
		}
	void getFatherName(String F) {
		System.out.println("FatherName:"+ F );
		
	}
	void getMotherName(String M) {
		System.out.println("MotherName:"+ M);
		
	}
	void getDateofbirth(String Dob) {
		System.out.println("Dateofbirth:"+ Dob);
	}
	void getCurrentAddress(String Cadd ) {
		System.out.println("CurrentAddress:"+ Cadd);
	}
	void getBloodGroup (String B) {
		System.out.println("BloodGroup:"+ B);
		
	}
	void getReligion (String R) {
		System.out.println("Religion:"+ R);
	}
	void getNationality (String N) {
		System.out.println("Nationality :"+ N);
	}
	void getSchool(String S) {
		System.out.println("School :"+ S);
	}
	void getIntermediate(String I) {
		System.out.println("Intermediate :"+ I);
	}
	void getTenthPercentage(Float T) {
		System.out.println("TenthPercentage :"+ T);
	}
	void getInterPercentage(Float I) {
		System.out.println("InterPercentage :"+ I);
	}
	void getAadhar(String A) {
		System.out.println("Aadhar :"+ A);
	}
	void getIFSCCode(String I) {
		System.out.println("IFSCCode :"+ I);
	}
	void getBankName(String B) {
		System.out.println("BankName :"+ B);
	}
	void getNCCStatus(String S) {
		System.out.println("NNCCStatus :"+ S);
	}
	void getUniversityName(String U) {
		System.out.println("UniversityName :"+ U);
	}
	void getPanNumber(String S) {
		System.out.println("PanNumber :"+ S);
	}
	void getTrainingprogram(String T) {
		System.out.println("Trainingprogram :"+ T);
	}
	void getTrainingDuration(String D) {
		System.out.println("TrainingDuration :"+ D);
	}
	void getStrength(String S) {
		System.out.println("Strength :"+ S);
	}
	void getWeakness(String W) {
		System.out.println("Weakness :"+ W);
	}
	void getCareerObjective(String C) {
		System.out.println("CareerObjective :"+ C);
	}
	void getLinkedInProfile(String L) {
		System.out.println("LinkedInProfile :"+ L);

	}
	void getGithubProfile(String G) {
		System.out.println("GithubProfile :"+ G);
	}
	void getResumeStatus(String R) {
		System.out.println("ResumeStatus :"+ R);

	}
	void getLanguageKnown(String L) {
		System.out.println("LanguageKnown :"+ L);

	}
	void getLanguageKnown2(String L) {
		System.out.println("LanguageKnown2 :"+ L);

	}
	void getLanguageKnown3(String L) {
		System.out.println("LanguageKnown3 :"+ L);

	}
	void getStudentStatus(String S) {
		System.out.println("getStudentStatus :"+ S);

	}



	
	 void main() {
		System.out.println("***************with arguments no return types*****************");
		System.out.println("Student Information !!");
	
		getName("M Gayathri Bai"); 
		getIFSCCode("SBI6152463728");
		getBankName("SBI");
		getFatherName("M Sankar Rao");
		getMotherName("M Lakshmi Bai");
		getRollNo(92);
		getAge(20);
		getGender('F');
		getCourse("BCA");
		getSchool("S.V School");
		getIntermediate("S.V College");
		getTenthPercentage(99.0F);
		getInterPercentage(80.0F);
		getMobile_Number(8463647328L);
		getPermanentAddress("Kadapa dt porumamilla AP");
		getCurrentAddress("Hyderabad KPHB Colony");
		getEmail("gayathri@gmail.com");
		getDepartment("Bachelor of computer application");
		getDateofbirth("22-10-2005");
		getBloodGroup("O Positive");
		getReligion("Hindu");
		getNationality("Indian");
		getAadhar("436262783543");
		getNCCStatus("No");
		getUniversityName("Chaithanya deemed to be university");
		getPanNumber("ABC747257482");
		getTrainingprogram("Java full stack");
		getTrainingDuration("6 Months");
		getStrength("Hardworking");
		getWeakness("Perfectionist");
		getCareerObjective("Software Developer");
		getLinkedInProfile("linkedin.com/gayathri");
		getGithubProfile("github.com/gayathri");
		getResumeStatus("Updated");
		getLanguageKnown("English");
		getLanguageKnown2("Telugu");
		getLanguageKnown3("Hindi");
		getStudentStatus("Active");
		System.out.println("****************NO Arguments with no return type***************");

		//NO Arguments with no return type
		getAge();
		doubleData();
		charGender() ;
		shortYear();
		System.out.println("****************NO Arguments + with return type****************");
		
	
		
		long result= getMobile();
		System.out.println(result);
		
	}
	
	 
	//NO Arguments with no return type
	
		 void getAge() {
		 System.out.println("Age: "+ 21);
	 }
		 void doubleData() {
			 double percentage = 89.9;
			 System.out.println("percentage : "+ percentage);
		 }
		 void charGender() {
			 char Gender = 'f';
			 System.out.println("Gender : "+ Gender);
		 
		 }
		 void shortYear() {
			 System.out.println("Year: "+ 2021);
			 
		 }

	 
		// NO Arguments + with return type
		
	    
	 
	 
	 
	 long getMobile() {
		 return 8500209100L;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
