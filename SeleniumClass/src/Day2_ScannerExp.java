import java.util.Scanner;

public class Day2_ScannerExp {
	//(((((a*b)+c)+d)-e)/f)
	public void valueresult()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for A is :");
		int a = sc.nextInt();
		//System.out.println("The Value for A is :"+a);
		System.out.println("Enter the Value for B is :");
		int b = sc.nextInt();
		System.out.println("Enter the Value for C is :");
		int c = sc.nextInt();
		System.out.println("Enter the Value for D is :");
		int d= sc.nextInt();
		System.out.println("Enter the Value for E is :");
		int e = sc.nextInt();
		System.out.println("Enter the Value for F is :");
		int f = sc.nextInt();
		int Result=(((((a*b)+c)+d)-e)/f);
		System.out.println("The Value of the Expression is:" +Result);
	}
	
	public int sum(int a,int b)
	{
		int c=a+b;
		
		System.out.println("The Sum value:" +c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c = a-b;
		System.out.println("The Subtracted value is :"+ c);
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("The Multiplication value:"+ c);
		return c;
	}
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("The Regular Expression  Value:" + c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		
		Day2_ScannerExp exp=new Day2_ScannerExp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for A is :");
		int a1 = sc.nextInt();
		//System.out.println("The Value for A is :"+a);
		System.out.println("Enter the Value for B is :");
		int b1 = sc.nextInt();
		System.out.println("Enter the Value for C is :");
		int c1 = sc.nextInt();
		System.out.println("Enter the Value for D is :");
		int d1 = sc.nextInt();
		System.out.println("Enter the Value for E is :");
		int e1 = sc.nextInt();
		System.out.println("Enter the Value for F is :");
		int f1 = sc.nextInt();
		
		int mulvalue=exp.mul(a1, b1);
		int sumvalue=exp.sum(mulvalue, c1);
		int sumvalue1=exp.sum(sumvalue,d1);
		int sub=exp.sub(sumvalue1, e1);
		exp.div(sub,f1);
		
		
		
		
	}

}
