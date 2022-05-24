package ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import AssignmentPrograms.Student;

public class ArrayListMethodClass {
	static ArrayList<Student> studentArrayList=new ArrayList<Student>(6);
	static ArrayList<Student> newArrayList=new ArrayList<Student>();
	static Scanner scanner=new Scanner(System.in);
	public ArrayListMethodClass() {
		// TODO Auto-generated constructor stub
	}
	
	 public static int getArrayListCapacity() throws Exception{
	        
	        //get the elementData field from ArrayList class
	        Field arrayField = ArrayList.class.getDeclaredField("elementData");
	        
	        /*
	         * Since the elementData field is private, we need 
	         * to make it accessible first 
	         */
	        arrayField.setAccessible(true);
	        
	        //now get the elementData Object array from our list
	        Object[] internalArray = (Object[])arrayField.get(studentArrayList);
	        
	        //Internal array length is the ArrayList capacity!
	        return internalArray.length;
	    }
	public static void comparetwoArrayList()
	{
		System.out.println("First ArrayList is");
		showAllStudent(studentArrayList);
		System.out.println("Second ArrayList is");
		showAllStudent(newArrayList);
		boolean flag=studentArrayList.equals(newArrayList);
		if(flag)
		{
			System.out.println("The ArrayLists are equal");
		}
		else
		{
			System.out.println("The ArrayLists are not equal");
		}
		
	}
	public static void copyingArray()
	{
		
		newArrayList.addAll(studentArrayList);
		showAllStudent(newArrayList);
	}
	@SuppressWarnings("resource")
	public static void extractAPortion()
	{
		
		System.out.println("Enter the RollNo");
		int rollNo=scanner.nextInt();
		for(Student student:studentArrayList)
		{
			System.out.println("RollNo                Name                         Age");
			if(student.getRollNo()==rollNo)
			{
				System.out.println(student.getRollNo()+"         "+student.getStudentName()+"           "+student.getStudentAge());
			}
		}
		//scanner.close();
	} 
	public static void updateStudentMethod(int rollNo)
	{
		
		for(Student s:studentArrayList)
		{
			if(s.getRollNo()==rollNo)
			{
				searchStudent(rollNo);
				System.out.println("select the field you want to update\n1.Name\n2.Age\n3.Address\n4.EmailId");
				char ch=scanner.next().charAt(0);
				switch(ch)
				{
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
		//scanner.close();
	}
	public static void shuffleStudentDetail()
	{
		Collections.shuffle(studentArrayList);
		showAllStudent(studentArrayList);
	}
	public static void reverseOrder()
	{
		
	}
	public static void addStudentMethod(int sNum)
	{
		
		int sRollNum=0;
		
		  for(int i=0;i<sNum;i++) 
		  { 
			  Student s=new Student();
		  if(studentArrayList.size()==0) sRollNum=1;
		  else
		  sRollNum=studentArrayList.size()+1;
		  s.setRollNo(sRollNum);
		  System.out.println("Enter the "+(i+1)+" student Name"); 
		  s.setStudentName(scanner.next());
		  System.out.println("Enter the age"); 
		  s.setStudentAge(scanner.nextInt());
		  System.out.println("Enter the address"); 
		  s.setAddress(scanner.next()); 
		  System.out.println("Enter the email Id"); 
		  s.setEmailId(scanner.next());
		  studentArrayList.add(s);
		  //studentArrayList.add(new Student(sRollNum,scanner.next(),scanner.nextInt(),scanner.next(),scanner.next())); 
		  }
		  
		  System.out.println("Students inserted");
		  
		/*
		 * studentArrayList.add(new Student(1,"suji",29,"Tvl","suji@gmail.com"));
		 * studentArrayList.add(new Student(2,"suji1",29,"Tvl","suji@gmail.com"));
		 * studentArrayList.add(new Student(3,"suji2",29,"Tvl","suji@gmail.com"));
		 * studentArrayList.add(new Student(4,"suji3",29,"Tvl","suji@gmail.com"));
		 * studentArrayList.add(new Student(5,"suji4",29,"Tvl","suji@gmail.com"));
		 */
		 
	}
	public static void searchStudent(int rollNo)
	{
		boolean found=false;
		for(Student s:studentArrayList)
		{
			if(s.getRollNo()==rollNo)
			{

				System.out.println(s.toString());
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("The student detail is not found");
		}
	}
	public static void removeStudentMethod(int rollNo)
	{
		int index=0;
		for(Student s:studentArrayList)
		{
			if(s.getRollNo()==rollNo)
			{
				index=studentArrayList.indexOf(s);
				studentArrayList.remove(index);
				break;
			}
		}
		System.out.println("The student is removed succesfully");
	}
	public static void showAllStudent(ArrayList<Student> studentArrayList)
	{
		System.out.println("ROLL_NO         NAME          AGE         ADDRESS       EMAIL_ID");
		for(Student s:studentArrayList)
		{
			System.out.println(s.toString());
		}
	}
}
