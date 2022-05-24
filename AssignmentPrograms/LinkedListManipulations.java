package AssignmentPrograms;


import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListManipulations {
	public LinkedListManipulations() {
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
				+ "9.Copy a LinkedListList into another\n10.Join two LinkedList List"
				+ "\n11.Increase capacity\n12.clone a LinkedList\n13.Trim the LinkedList List Capacity"
				+ "\n14.print using position\n15.Extract a portion of student info\n"
				+ "16.Check for empty and empty a LinkedList list\n17.Compare two LinkedListList");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter the number of students you want to add");
			int snum=sc.nextInt();
			LinkedListMethods.addStudentMethod(snum);
			break;
		case 2:
			System.out.println("Enter a RollNo");
			int rollNo=sc.nextInt();
			LinkedListMethods.searchStudent(rollNo);
			break;
		case 3:
			System.out.println("Enter a RollNo");
			int rollNo2=sc.nextInt();
			LinkedListMethods.updateStudentMethod(rollNo2);
			break;
		case 4:
			System.out.println("Enter a RollNo");
			int rollNo1=sc.nextInt();
			LinkedListMethods.removeStudentMethod(rollNo1);
			break;
		case 5:
			LinkedListMethods.showAllStudent(LinkedListMethods.studentList);
			break;
		case 6:

			Collections.sort(LinkedListMethods.studentList,new Student());
			LinkedListMethods.showAllStudent(LinkedListMethods.studentList);
			break;
		case 7:
			LinkedListMethods.shuffleStudentDetail();
			break;
		case 8:
			Collections.reverse(LinkedListMethods.studentList);
			LinkedListMethods.showAllStudent(LinkedListMethods.studentList);
			break;
		case 9:
			System.out.println("The new copied LinkedListList is");
			LinkedListMethods.copyingLinkedList();
			break;
		case 10:
			System.out.println("The LinkedLists after joined is");
			LinkedListMethods.newList.addAll(LinkedListMethods.studentList);
			LinkedListMethods.showAllStudent(LinkedListMethods.newList);
			break;
		case 11:
			System.out.println("The LinkedList by default should not have capacity as it does not allocate memory to the items "
					+ "before the\n items are added to the list.Each item in a LinkedList holds a pointer to the next in the list.Hence it does not need any initial size");
						break;
		case 12:
			@SuppressWarnings("unchecked") LinkedList<Student> lL=(LinkedList<Student>)LinkedListMethods.studentList.clone();
			LinkedListMethods.showAllStudent(lL);
			break;
		case 13:
			LinkedListMethods.studentList.hashCode();
			LinkedListMethods.showAllStudent(LinkedListMethods.studentList);
			break;
		case 14:
			for(int i=0;i<LinkedListMethods.studentList.size();i++)
			{
				System.out.print(LinkedListMethods.studentList.get(i));
			}
			break;
		case 15:
			System.out.println("Retrieveing a portion from object");
			LinkedListMethods.extractAPortion();
			break;
		case 16:
			if(LinkedListMethods.newList.isEmpty())
				System.out.println("The LinkedList List is empty");
			else
				LinkedListMethods.newList.clear();
			System.out.println("The LinkedList List is emptied");
			LinkedListMethods.showAllStudent(LinkedListMethods.newList);
			break;
		case 17:
			LinkedListMethods.comparetwoLinkedList();
			break;
			

		}
		System.out.println("Do you want to go to Main Menu?\n1.Yes\n2.No");
		choice=sc.next().charAt(0);
		}while(choice=='1');

	}
}
