package HashMap;

import java.util.Scanner;

class AddStudentDetail {
public static void addStudentDetails(int sNum)
{
	Scanner scanner=new Scanner(System.in);
	int sRollNum=0;
	
	  for(int i=0;i<sNum;i++) 
	  { 
		  Student s=new Student();
	  if(HashMapManipulation.studentMap.size()==0) sRollNum=1;
	  else
	  sRollNum=HashMapManipulation.studentMap.size()+1;
	  System.out.println("Enter the "+(i+1)+" student Name"); 
	  s.setStudentName(scanner.next());
	  System.out.println("Enter the age"); 
	  s.setStudentAge(scanner.nextInt());
	  System.out.println("Enter the address"); 
	  s.setAddress(scanner.next()); 
	  System.out.println("Enter the email Id"); 
	  s.setEmailId(scanner.next());
	  HashMapManipulation.studentMap.put(sRollNum, s); 
	  }
	 System.out.println("Students inserted");
	 scanner.close();
}
}
