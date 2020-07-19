
public class Day2_Expression2 {
//(((((10/2)+2)+2)-2)*2)
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
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("The Regular Expression value:"+ c);	
	}
	public int div(int a,int b)
	{
		int c=a/b;
		System.out.println("The Division Value:" + c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day2_Expression2 d=new Day2_Expression2();
int Div= d.div(10, 2);
int Sum=d.sum(Div, 2);
int Sum2=d.sum(Sum, 2);
int sub=d.sub(Sum2,2);
d.mul(sub, 2);
//System.out.print("The result of Regular Epression is:" +Result);
	}

}
