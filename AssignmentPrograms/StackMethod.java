package AssignmentPrograms;

import java.util.Scanner;
import java.util.Stack;

public class StackMethod {
	static Stack<Student> studentStack=new Stack<Student>();
	
	public StackMethod() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

	}
	public static void stackPushOperation(int sNum)
	{
		Scanner scan=new Scanner(System.in);
		int sRollNum=0;

		for(int i=0;i<sNum;i++) 
		{ 
			if(studentStack.size()==0) sRollNum=1;
			else
				sRollNum=studentStack.size()+1;

			System.out.println("Enter the "+(i+1)+" student Name");	
			String sName=scan.next(); 
			System.out.println("Enter the age");
			int sAge=scan.nextInt(); 
			System.out.println("Enter the address"); 
			String  sAddress=scan.next();
			System.out.println("Enter the email Id"); 
			String	mailId=scan.next(); 
			studentStack.push(new Student(sRollNum,sName,sAge,sAddress,mailId)); 
		}
		System.out.println("Students inserted");
		scan.close();
	}

	public static void stackPopOperation()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of records you want to pop");
		int num=scan.nextInt();
		System.out.println("RollNo_________Name___________Age____________Address________PhoneNumber");
		for(int i=0;i<num;i++)
		{
			System.out.println(studentStack.pop());
		}
		scan.close();
	}
	public static void stackUnderFlow() {
		for(int i=0;i<=studentStack.size();i++);
		{
			System.out.println(studentStack.pop());
		}
		
	}
	public static void stackTopOperation()
	{
		/*System.out.println("Enter the number of records you want to pop");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{*/
		System.out.println("RollNo_________Name___________Age____________Address________PhoneNumber");
		System.out.println("The top Student in the list is");
			System.out.println(studentStack.peek());
		//} 
			
		
	}
}
