package com.Day3;

public class Test {
	public Test()
	{
    this(1,2,3);
	System.out.print("\nDefault Method\n");
	}
	public Test(int a)
	{
   //1. this(1,2,3,4);
		this(1,2);
	System.out.print("\nOne Parameterized Method");
	}
	public Test(int a,int b)
	{
  this(1,2,3,4);
	System.out.println("\n");
	System.out.print("\nTwo Parameterized Method\n");
	}
	
	public Test(int a,int b,int c)
	{
  //1.this(2);
	//this(1);	
	System.out.print("\nThree Parameterized Method\n");
	}
	public Test(int a,int b,int c,int d)
	{
	
	System.out.print("\nFour Parameterized Method\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Seq_Assignment1 s=new Seq_Assignment1(1,2,3);
		Test s=new Test();

	}

}

	
