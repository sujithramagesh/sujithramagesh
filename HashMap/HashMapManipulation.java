package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapManipulation {
	protected static HashMap<Integer,Student> studentMap=new HashMap<Integer, Student>();
	protected static HashMap<Integer,Student> newMap=new HashMap<Integer, Student>();
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the HashMap options"
				+ "\n1.Add a student in the map\n2.Count number of Students\n3.Copy Map\n4.Remove All\n4.Search for a key value pair"
				+ "\n5.Shallow Copy of a HashMap Instance\n6.Search with key\n7.Search with value\n8.Set view of the Student details");
		char ch=scanner.next().charAt(0);
		switch(ch)
		{
		case 1:
			System.out.println("Enter the number of students you want to add");
			int sNum=scanner.nextInt();
			AddStudentDetail.addStudentDetails(sNum);
			break;
		case 2:
			System.out.println("The total number of students is"+studentMap.size());
			break;
		case 3:
			
			break;
		case 4:
			System.out.println("1.Search with key\n2.Search with value\n3.Search for key-value pair");
			char option=scanner.next().charAt(0);
			switch(option)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
			break;
		case 5:
			break;
		case 6:
			break;
		}
	}
}
