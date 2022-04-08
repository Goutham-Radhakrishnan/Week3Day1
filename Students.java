package org.system;

public class Students 
{
	
	public void getStudentsInfo() 
	{
		System.out.println("Students Data");
	}
	
	public void getStudentsInfo(int id) 
	{
		System.out.println("Students ID : " + id);
	}
	
	public void getStudentsInfo(int id, String name) 
	{
		System.out.println("Students Rank : " + id + " and Name : " + name);
	}
	
	public void getStudentsInfo(String email, long phoneNumber) 
	{
		System.out.println("Students Email : " + email + " and Phone number : " + phoneNumber);
	}
	
	public static void main(String[] args) 
	{
		Students stud = new Students();
		stud.getStudentsInfo();
		stud.getStudentsInfo(51643570);
		stud.getStudentsInfo( 05,"R.GOUTHAM");
		stud.getStudentsInfo("goutham@testleaf.com", 805600191);
	}
}