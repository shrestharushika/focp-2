package com.ncu.assignment.main;
import java.util.*;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.classes.*;
import com.ncu.assignment.exception.*;
class StudentDriver
{
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		Address addr;
		 Student student;
		 String firstName= s.nextLine();
		 String lastName= s.nextLine();
		 String line1=s.nextLine();
		 String line2=s.nextLine();
		 String city=s.nextLine();
		 String state=s.nextLine();
		 int pinCode=s.nextInt();
         addr= new Address(line1,line2,city,state,pinCode);
		 Qualification qual[];
		 int length=50;
		 String qualName=s.nextLine();
		 String university=s.nextLine();
		 String institute=s.nextLine();
		 float cgpa=s.nextFloat();
		 qual[]= new Qualification[length];
		 for(int i=0;i<qual.length;i++)
		 {
		  qual[i]= new Qualification(qualName,university,institute,cgpa);
		 }
		 String[]skills= new String[50];
		 for(int i=0;i<skills.length;i++)
		 {
		 	skills[i]=s.nextLine();
		 } 
		 Project project[];
		 int length=50;
		 String name= s.nextLine();
		 String role= s.nextLine();
		 String[]responsibilities= new String[50];
		 for(int i=0;i<responsibilities.length;i++)
		 {
		 	responsibilities[i]=s.nextLine();
		 }
		 project[]= new Project[length];
		 for(int i=0;i<project.length;i++)
		 {
		 	project[i]= new Project(name,role,responsibilities[i]);
		 }
		 String eMail= s.nextLine();
		 String contactNo= s.nextLine();
		 student= new Student(firstName,lastName,addr,qual[i],skills[i],project[i],eMail,contactNo);
		 String details= student.display();



	}
}