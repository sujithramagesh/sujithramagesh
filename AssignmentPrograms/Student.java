package AssignmentPrograms;

import java.util.Comparator;

public class Student implements Comparator<Student>{

	public Student() {
		// TODO Auto-generated constructor stub
	}
	private int rollNo;
	private String studentName;
	private int studentAge;
	private String address;
	private String emailId;
	
	/*
	 * public Student(int rollNo, String studentName, int studentAge, String
	 * address, String emailId) { super(); this.rollNo = rollNo; this.studentName =
	 * studentName; this.studentAge = studentAge; this.address = address;
	 * this.emailId = emailId; }
	 */
	
	@Override
	public String toString() {
		return rollNo + "             "+ studentName + "                  " + studentAge
				+ "          " + address + "             " + emailId ;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.studentName.compareTo(o2.studentName);
	}
	

}
