package AssignmentPrograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMethods {
	static LinkedList<Student> studentList = new LinkedList<Student>();
	static LinkedList<Student> newList = new LinkedList<Student>();
	static Scanner scanner = new Scanner(System.in);

	public LinkedListMethods() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public static int getLinkedListCapacity() throws Exception{
	 * 
	 * //get the elementData field from LinkedList class Field LinkedField =
	 * LinkedList.class.getDeclaredField("elementData");
	 * 
	 * 
	 * Since the elementData field is private, we need to make it accessible first
	 * 
	 * LinkedField.setAccessible(true);
	 * 
	 * //now get the elementData Object Linked from our list Object[] internalLinked
	 * = (Object[])LinkedField.get(studentList);
	 * 
	 * //Internal Linked length is the LinkedList capacity! return
	 * internalLinked.length; }
	 */
	public static void comparetwoLinkedList() {
		System.out.println("First LinkedList is");
		showAllStudent(studentList);
		System.out.println("Second LinkedList is");
		showAllStudent(newList);
		boolean flag = studentList.equals(newList);
		if (flag) {
			System.out.println("The LinkedLists are equal");
		} else {
			System.out.println("The LinkedLists are not equal");
		}
		
		/*
		 * if(studentList.size()==newList.size()) {
		 * 
		 * } else System.out.
		 * println("The sizes of two Linked List are different hence it cannot be compared"
		 * );
		 */
	}

	public static void copyingLinkedList() {

		newList.addAll(studentList);
		showAllStudent(newList);
	}

	@SuppressWarnings("resource")
	public static void extractAPortion() {

		System.out.println("Enter the RollNo");
		int rollNo = scanner.nextInt();
		for (Student student : studentList) {
			System.out.println("RollNo                Name                         Age");
			if (student.getRollNo() == rollNo) {
				System.out.println(student.getRollNo() + "         " + student.getStudentName() + "           "
						+ student.getStudentAge());
			}
		}
		// scanner.close();
	}

	public static void updateStudentMethod(int rollNo) {

		for (Student s : studentList) {
			if (s.getRollNo() == rollNo) {
				searchStudent(rollNo);
				System.out.println("select the field you want to update\n1.Name\n2.Age\n3.Address\n4.EmailId");
				char ch = scanner.next().charAt(0);
				switch (ch) {
				case '1':
					System.out.println("Enter the name");
					s.setStudentName(scanner.next());
					break;
				case '2':
					System.out.println("Enter the age");
					s.setStudentAge(scanner.nextInt());
					break;
				case '3':
					System.out.println("Enter the address");
					s.setAddress(scanner.next());
					break;
				case 4:
					System.out.println("Enter the email Id");
					s.setEmailId(scanner.next());
					break;
				}

			}
		}
		searchStudent(rollNo);
		// scanner.close();
	}

	public static void shuffleStudentDetail() {
		Collections.shuffle(studentList);
		showAllStudent(studentList);
	}


	public static void addStudentMethod(int sNum) {

		int sRollNum = 0;

		for (int i = 0; i < sNum; i++) {
			if (studentList.size() == 0)
				sRollNum = 1;
			else
				sRollNum = studentList.size() + 1;

			System.out.println("Enter the " + (i + 1) + " student Name");
			String sName = scanner.next();
			System.out.println("Enter the age");
			int sAge = scanner.nextInt();
			System.out.println("Enter the address");
			String sAddress = scanner.next();
			System.out.println("Enter the email Id");
			String mailId = scanner.next();
			studentList.add(new Student(sRollNum, sName, sAge, sAddress, mailId));
		}
		System.out.println("Students inserted");

		/*
		 * studentList.add(new Student(1,"suji",29,"Tvl","suji@gmail.com"));
		 * studentList.add(new Student(2,"suji1",29,"Tvl","suji@gmail.com"));
		 * studentList.add(new Student(3,"suji2",29,"Tvl","suji@gmail.com"));
		 * studentList.add(new Student(4,"suji3",29,"Tvl","suji@gmail.com"));
		 * studentList.add(new Student(5,"suji4",29,"Tvl","suji@gmail.com"));
		 */

	}

	public static void searchStudent(int rollNo) {
		boolean found = false;
		System.out.println("ROLL_NO         NAME          AGE         ADDRESS       EMAIL_ID");
		for (Student s : studentList) {
			if (s.getRollNo() == rollNo) {

				System.out.println(s.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("The student detail is not found");
		}
	}

	public static void removeStudentMethod(int rollNo) {
		for (Student s : studentList) {
			if (s.getRollNo() == rollNo) {
				int index = studentList.indexOf(s);
				studentList.remove(index);
				break;
			}
		}
		System.out.println("The student is removed succesfully");
	}

	public static void showAllStudent(LinkedList<Student> studentList) {
		System.out.println("ROLL_NO         NAME          AGE         ADDRESS       EMAIL_ID");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
	}
}
