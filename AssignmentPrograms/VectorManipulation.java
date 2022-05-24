package AssignmentPrograms;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorManipulation {
	public VectorManipulation() {
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
				+ "9.Copy a VectorList into another\n10.Join two Vector List"
				+ "\n11.Increase capacity\n12.clone a Vector\n13.Trim the Vector List Capacity"
				+ "\n14.print using position\n15.Extract a portion of student info\n"
				+ "16.Check for empty and empty a Vector list\n17.Compare two VectorList");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter the number of students you want to add");
			int snum=sc.nextInt();
			VectorMethods.addStudentMethod(snum);
			break;
		case 2:
			System.out.println("Enter a RollNo");
			int rollNo=sc.nextInt();
			VectorMethods.searchStudent(rollNo);
			break;
		case 3:
			System.out.println("Enter a RollNo");
			int rollNo2=sc.nextInt();
			VectorMethods.updateStudentMethod(rollNo2);
			break;
		case 4:
			System.out.println("Enter a RollNo");
			int rollNo1=sc.nextInt();
			VectorMethods.removeStudentMethod(rollNo1);
			break;
		case 5:
			VectorMethods.showAllStudent(VectorMethods.studentList);
			break;
		case 6:

			Collections.sort(VectorMethods.studentList,new Student());
			VectorMethods.showAllStudent(VectorMethods.studentList);
			break;
		case 7:
			VectorMethods.shuffleStudentDetail();
			break;
		case 8:
			Collections.reverse(VectorMethods.studentList);
			VectorMethods.showAllStudent(VectorMethods.studentList);
			break;
		case 9:
			System.out.println("The new copied VectorList is");
			VectorMethods.copyingVector();
			break;
		case 10:
			System.out.println("The Vectors after joined is");
			VectorMethods.newList.addAll(VectorMethods.studentList);
			VectorMethods.showAllStudent(VectorMethods.newList);
			break;
		case 11:
			System.out.println("The Vector list before increasing is");
			System.out.println("Capacity is 6");
			//System.out.println("Capacity: "+VectorMethods.getVectorListCapacity());
			System.out.println("The Vector List after increasing capacity is");
			VectorMethods.studentList.ensureCapacity(16);
			System.out.println("VectorList capacity is increased to 16");
			//System.out.println("The VectorList size is"+VectorMethods.studentList.size());
			//System.out.println("Capacity: "+VectorMethods.getVectorListCapacity());
			break;
		case 12:
			@SuppressWarnings("unchecked") Vector<Student> Arr=(Vector<Student>)VectorMethods.studentList.clone();
			VectorMethods.showAllStudent(Arr);
			break;
		case 13:
			VectorMethods.studentList.trimToSize();
			VectorMethods.showAllStudent(VectorMethods.studentList);
			break;
		case 14:
			for(int i=0;i<VectorMethods.studentList.size();i++)
			{
				System.out.print(VectorMethods.studentList.get(i));
			}
			break;
		case 15:
			System.out.println("Retrieveing a portion from object");
			VectorMethods.extractAPortion();
			break;
		case 16:
			if(VectorMethods.newList.isEmpty())
				System.out.println("The Vector List is empty");
			else
				VectorMethods.newList.clear();
			System.out.println("The Vector List is emptied");
			VectorMethods.showAllStudent(VectorMethods.newList);
			break;
		case 17:
			VectorMethods.comparetwoVectorList();
			break;
			

		}
		System.out.println("Do you want to go to Main Menu?\n1.Yes\n2.No");
		choice=sc.next().charAt(0);
		}while(choice=='1');

	}
}
