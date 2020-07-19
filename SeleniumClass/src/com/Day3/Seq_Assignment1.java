package com.Day3;

public class Seq_Assignment1 {

	public Seq_Assignment1()
	{
    this(1,2,3);
	System.out.print("\nDefault Method");
	}
	public Seq_Assignment1(int a)
	{
   //1. this(1,2,3,4);
	this(1,2);	
	System.out.print("One Parameterized Method");
	}
	public Seq_Assignment1(int a,int b)
	{
   this(1,2,3,4) ;
	
	System.out.print("Two Parameterized Method");
	}
	
	public Seq_Assignment1(int a,int b,int c)
	{
  //1.this(2);
	this(1);	
	System.out.print("Three Parameterized Method");
	}
	public Seq_Assignment1(int a,int b,int c,int d)
	{

	System.out.print("Four Parameterized Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Seq_Assignment1 s=new Seq_Assignment1(1,2,3);
		Seq_Assignment1 s=new Seq_Assignment1();

	}

}
