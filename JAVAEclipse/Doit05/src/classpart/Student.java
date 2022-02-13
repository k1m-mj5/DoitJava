package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	/*
	public static void main(String[] args) {
		
		Student student01 = new Student();
		student01.studentName = "Alice";
		student01.address = "California US";
		
		student01.showStudentInfor();
		
		} 
	*/
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student student02 = new Student();
		student02.studentName = "Bob";
		student02.studentID = 102;
		student02.address = "London, UK";
		
		Student student03 = new Student();
		student03.studentName = "Carol";
		student03.studentID = 103;
		student03.address = "SP, Brazil";
		
		student02.showStudentInfor();
		student03.showStudentInfor();
		
	}
}
