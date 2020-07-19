
public class Student_SeleniumAssignment1 { //Defining class
 //Declaring Variables
	int SNo=1;
	String Sname="Srilatha";
 public void display()//Creation of MEthod
 {
	 System.out.println("Welcome to Selenium classes");
 }
 public void Studentinfo()
 {
	System.out.println("Student no:"+SNo);
	System.out.println("Student Name:"+Sname);
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student_SeleniumAssignment1 s=new Student_SeleniumAssignment1();//Creating object for the class
s.display();//Calling the method
s.Studentinfo();
}

}
