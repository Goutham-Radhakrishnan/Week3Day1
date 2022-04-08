package org.system;

public class Student extends Department 
{
	
	public void studentName() 
	{
		System.out.println("R.GOUTHAM");
	}
	
	public void studentDept() 
	{
		System.out.println("ECE");
	}
	
	public void studentId() 
	{
		System.out.println("51643570");
	}
	
	public static void main(String[] args) 
	{
	   Student object = new Student();
	   object.collegeCode();
	   object.collegeName();
	   object.collegeRank();
	   object.depttName();
	   object.studentName();
	   object.studentId();
	   object.studentDept();
		
	}

}
