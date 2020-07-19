
public class Day2_Expression1 {
	
	public int expressionresult(int a,int b)//The Method for Formula Execution
	{
		int c=((((((a+b))-b)+b)*b)/b);
		System.out.println("The value of the Regular expression :"+ c);
		return c;
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
		// TODO Auto-generated method stub
        Day2_Expression1 d=new Day2_Expression1();
	//	d.expressionresult(10, 2);//object creation for formula execution
        int sum=d.sum(10, 2);
        int sub=d.sub(sum, 2);
        int sum2=d.sum(sub, 2);
        int mul=d.mul(sum2, 2);
        d.div(mul, 2);
    //    System.out.println("The value of the Regular Expression is:" +Result);
        
		
	}

}
