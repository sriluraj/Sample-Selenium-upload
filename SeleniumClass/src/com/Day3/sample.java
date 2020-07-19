package com.Day3;

public class sample {
	
		public sample()
		{
			this(1,2,3,4);
			System.out.print("\nDefault Constructor\n");
		}
		public sample(int a)
		{
			this(1,2);
			System.out.print("\nOne Parameterized Construcotr");
		}
		public sample(int a,int b)
		{
           this();
			System.out.print("Two Parameterized Construcotr\n");
		}
		
		public sample(int a,int b,int c)
		{
	 
		this(1);
			System.out.print("\nThree Parameterized Construcotr\n");
		}	
		public sample(int a,int b,int c,int d)
		{    
			//this();
			System.out.print("\nFour Parameterized Construcotr\n");
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s=new sample(1,2,3);
	
	}

}
