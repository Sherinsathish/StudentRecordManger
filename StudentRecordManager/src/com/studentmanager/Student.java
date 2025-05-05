	package com.studentmanager;
	
	public class Student {
		
		//Parameters that im goin to use
		String Name;
		int Age;
		String Rollno;
		String Branch;
		static String clg="KIT";
		
		//Constructor
		Student(String Name,int Age,String Rollno,String Branch)
		{
			this.Name=Name;
			this.Age=Age;
			this.Rollno=Rollno;
			this.Branch=Branch;
		}
		
		
		//setter to the parameters(used as a private)
		public void setname(String Name)
		{
			this.Name=Name;
		}
		public void setage(int Age)
		{
			this.Age=Age;
		}
		public void setrollno(String Rollno)
		{
			this.Rollno=Rollno;
		}
		public void setbranch(String Branch)
		{
			this.Branch=Branch;
		}
		
		
		//getter 
		public String getname()
		{
			return Name;
		}
		public int getage()
		{
			return Age;
		}
		public String getrollno()
		{
			return Rollno;
		}
		public String getbranch()
		{
			return Branch;
		}
		
		//to display		
		public void DisplayDetails()
		{
			System.out.println("Collage name: "+clg);
			System.out.println("Name: "+Name);
			System.out.println("Age: "+Age);
			System.out.println("Rollno: "+Rollno);
			System.out.println("Branch: "+Branch);
			
			
		}
	
	}
