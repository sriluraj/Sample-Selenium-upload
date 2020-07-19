package com.Day3;

public class Seq_method {

	public void Test()
	{
    
	System.out.print("\nDefault Method\n");
	}
	public void Test(int a)
	{
   
	this.Test(1,2,3,4);	
	System.out.print("One Parameterized Method");
	}
	public void Test(int a,int b)
	{
    this.Test(1, 2, 3);
	System.out.print("\nTwo Parameterized Method\n");
	}
	
	public void Test(int a,int b,int c)
	{
	this.Test(1);
	System.out.print("\nThree Parameterized Method\n");
	}
	public void Test(int a,int b,int c,int d)
	{
	this.Test();
	System.out.print("\nFour Parameterized Method\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seq_method  s=new Seq_method ();
		s.Test(1, 2);
	}

}
