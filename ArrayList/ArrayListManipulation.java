package ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import AssignmentPrograms.Student;

public class ArrayListManipulation {
	public ArrayListManipulation() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char choice = 0;
		do
		{
			
		System.out.println("Enter an option:");
		System.out.println("1.Enter student\n2.Search student\n3.Update student\n"
				+ "4.Remove student\n5.Show All Student\n6.Sorted Details"
				+ "\n7.Shuffle the list\n8.Reverse the list\n"
				+ "9.Copy an arrayList into another\n10.Join two array List"
				+ "\n11.Increase capacity\n12.clone an array\n13.Trim the array List Capacity"
				+ "\n14.print using position\n15.Extract a portion of student info\n"
				+ "16.Check for empty and empty an Array list\n17.Compare two ArrayList");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter the number of students you want to add");
			int snum=sc.nextInt();
			ArrayListMethodClass.addStudentMethod(snum);
			break;
		case 2:
			System.out.println("Enter a RollNo");
			int rollNo=sc.nextInt();
			ArrayListMethodClass.searchStudent(rollNo);
			break;
		case 3:
			System.out.println("Enter a RollNo");
			int rollNo2=sc.nextInt();
			ArrayListMethodClass.updateStudentMethod(rollNo2);
			break;
		case 4:
			System.out.println("Enter a RollNo");
			int rollNo1=sc.nextInt();
			ArrayListMethodClass.removeStudentMethod(rollNo1);
			break;
		case 5:
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.studentArrayList);
			break;
		case 6:

			Collections.sort(ArrayListMethodClass.studentArrayList,new Student());
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.studentArrayList);
			break;
		case 7:
			ArrayListMethodClass.shuffleStudentDetail();
			break;
		case 8:
			Collections.reverse(ArrayListMethodClass.studentArrayList);
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.studentArrayList);
			break;
		case 9:
			System.out.println("The new copied ArrayList is");
			ArrayListMethodClass.copyingArray();
			break;
		case 10:
			System.out.println("The arrays after joined is");
			ArrayListMethodClass.newArrayList.addAll(ArrayListMethodClass.studentArrayList);
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.newArrayList);
			break;
		case 11:
			System.out.println("The array list before increasing is");
			System.out.println("Capacity is 6");
			//System.out.println("Capacity: "+ArrayListMethodClass.getArrayListCapacity());
			System.out.println("The array List after increasing capacity is");
			ArrayListMethodClass.studentArrayList.ensureCapacity(16);
			System.out.println("ArrayList capacity is increased to 16");
			//System.out.println("The ArrayList size is"+ArrayListMethodClass.studentArrayList.size());
			//System.out.println("Capacity: "+ArrayListMethodClass.getArrayListCapacity());
			break;
		case 12:
			 @SuppressWarnings("unchecked") ArrayList<Student> Arr=(ArrayList<Student>)ArrayListMethodClass.studentArrayList.clone();
			ArrayListMethodClass.showAllStudent(Arr);
			break;
		case 13:
			ArrayListMethodClass.studentArrayList.trimToSize();
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.studentArrayList);
			break;
		case 14:
			for(int i=0;i<ArrayListMethodClass.studentArrayList.size();i++)
			{
				System.out.print(ArrayListMethodClass.studentArrayList.get(i));
			}
			break;
		case 15:
			System.out.println("Retrieveing a portion from object");
			ArrayListMethodClass.extractAPortion();
			break;
		case 16:
			if(ArrayListMethodClass.newArrayList.isEmpty())
				System.out.println("The array List is empty");
			else
				ArrayListMethodClass.newArrayList.clear();
			System.out.println("The array List is emptied");
			ArrayListMethodClass.showAllStudent(ArrayListMethodClass.newArrayList);
			break;
		case 17:
			ArrayListMethodClass.comparetwoArrayList();
			break;
			

		}
		System.out.println("Do you want to go to Main Menu?\n1.Yes\n2.No");
		choice=sc.next().charAt(0);
		}while(choice=='1');

	}
}
