package com.studentmanager;


import java.util.*;
public class StudentManager {
	
	static Scanner sc=new Scanner(System.in); 
	
	public static void main(String[] args) throws InterruptedException {

		ArrayList<Student> Student_detail= new ArrayList<>();
		
		Student s1=new Student("Angel",18,"21bec01","ECE");
		Student s2=new Student("Banu",18,"21bec02","ECE");
		Student s3=new Student("Cindrella",18,"21bec03","ECE");
		Student s4=new Student("Danila",17,"21bec04","ECE");
		Student s5=new Student("Edward",18,"21bec05","ECE");
		
		Student_detail.add(s1);
		Student_detail.add(s2);
		Student_detail.add(s3);
		Student_detail.add(s4);
		Student_detail.add(s5);
		
		boolean flag=true;
		do
		{	
			System.out.println("\t\t\tWelcome to StudentManager");
			System.out.println("Enter your option");
			System.out.println("	1.To add Student ");
			System.out.println("	2.To remove Student ");
			System.out.println("	3.View details of a student");
			System.out.println("	4.View all Students");
			System.out.println("	5.Exit");
			
			int n=sc.nextInt();
			
			switch(n) 
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the name:");
				String Name=sc.nextLine();
				System.out.println("Enter the age:");
				int Age=sc.nextInt();
				sc.nextLine(); 
				System.out.println("Enter the rollno:");
				String rollno=sc.nextLine();
				System.out.println("Enter the Branch:");
				String Branch=sc.nextLine();
					
				Student obj =new Student(Name,Age,rollno,Branch);
					
				Student_detail.add(obj);
				
				Thread.sleep(2000);
				
				System.out.println("Successfully added");
				break;
				
			case 2:	
				System.out.println("Enter name");
				String student_name=sc.nextLine();
				
				boolean found= false;
				for(int i=0;i<Student_detail.size();i++)
				{
					Student s = Student_detail.get(i);
					if (s.getname().equalsIgnoreCase(student_name)) 
					{
					       Student_detail.remove(i);
					       System.out.println(" Student removed successfully.");
					       found = true;
					       break;
					}
				}
				if(!found)
				{
					System.out.println("Student not found");
				}
				break;
				
			case 3:	
				System.out.println("Enter name");
				String student_name1=sc.nextLine();
				 for(int i=0;i<Student_detail.size();i++)
				 {
					 Student s= Student_detail.get(i);
					 if (s.getname().equalsIgnoreCase(student_name1)) 
					 {	 
						 System.out.println("Name: "+s.getname());
						 System.out.println("Age: "+s.getage());
						 System.out.println("Rollno: "+s.getrollno());
						 System.out.println("Branch: "+s.getbranch());
					 }
				 }
				 break;
			
			case 4:
				for(int i=0;i<Student_detail.size();i++)
				{
					 Student s= Student_detail.get(i);
					 s.DisplayDetails();
				}
				break;
				
			case 5:
				System.out.println("Successfully exited");
				flag=false;
			}
			
		}
		while(flag);
	}
}
