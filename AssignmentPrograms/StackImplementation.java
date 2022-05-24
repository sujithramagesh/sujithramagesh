package AssignmentPrograms;

import java.util.Scanner;

public class StackImplementation {

	public StackImplementation() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
			char opt;
			do
			{
				System.out.println("-------------------STACK IMPLEMENTATION----------------------");
			System.out.println("Enter the Option");
			System.out.println("1.Push Operation\n2.Pop Operation\n3.Top Operation\n4.Stack overflow\n5.Stack Underflow");
			char choice=scanner.next().charAt(0);
			switch(choice)
			{
			case '1':
				System.out.println("Enter the number of students you want to add");
				int sNum=scanner.nextInt();
				StackMethod.stackPushOperation(sNum);
				break;
			case '2':
				StackMethod.stackPopOperation();
				break;
			case '3':
				StackMethod.stackTopOperation();
				break;
			case '4':
				StackMethod.stackUnderFlow();
				break;
			case '5':
				break;
			}

			System.out.println("Do you want to continue?\n1.Yes\n2.No");
			opt=scanner.next().charAt(0);
			}while(opt=='1');

		
	}
}
