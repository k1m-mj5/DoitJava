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
}
