package AssignmentPrograms;

import java.util.Random;
import java.util.Scanner;

public class CheckConditionWithoutUsingIf {

	public CheckConditionWithoutUsingIf() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*
	 * Map<Integer,String> gradingMap=new HashMap<Integer, String>();
	 * gradingMap.put(10, "A"); gradingMap.put(9, "A"); gradingMap.put(8, "A");
	 * gradingMap.put(7,"B"); gradingMap.put(6, "C"); gradingMap.put(5, "D");
	 * gradingMap.put(4, "E"); gradingMap.put(3, "F"); gradingMap.put(2, "F");
	 * gradingMap.put(1, "F"); gradingMap.put(0, "F");
	 * System.out.println("Enter the marks"); int marks=sc.nextInt();
	 * System.out.println("Grade "+gradingMap.get(marks/10));
	 */
	String[] gradeArray=new String[11];
	gradeArray[10]="A";
	gradeArray[9]="A";
	gradeArray[8]="A";
	gradeArray[7]="B";
	gradeArray[6]="C";
	gradeArray[5]="D";
	gradeArray[4]="E";
	gradeArray[3]="F";
	gradeArray[2]="F";
	gradeArray[1]="F";
	gradeArray[0]="F";
	System.out.println("Enter the marks");
	int marks=sc.nextInt();
	 System.out.println("Grade "+gradeArray[marks/10]);
	
}
}
