package com.Day3;

public class Student_static {

	int a;
	static int b;
	public void Student()
	{
		System.out.println("Student is non static  method");
	}
	
	public static void Studentdemo()
	{
	//static int c=2; cant declare as static
	System.out.println("This is a static method");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Value of the static variable is:"+Student_static.b);
		Student_static.Studentdemo();
		Student_static s=new Student_static();
		s.Student();
		
		
	}

}
