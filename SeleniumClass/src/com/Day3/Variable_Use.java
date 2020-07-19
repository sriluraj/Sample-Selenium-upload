package com.Day3;

public class Variable_Use {
 
	int a=1;
 static int b=2;
 public void test()
 {
	 System.out.println("The value of a:"+a);
	 System.out.println("The value of b:"+b);
	 
 }
public  static void testVar()
 {
	 //int b=3;
	//xSystem.out.println("The value of b:"+a);
	 System.out.println("The value of b:"+b);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variable_Use.testVar();
	Variable_Use a=new Variable_Use();
a.test();

	}

}
