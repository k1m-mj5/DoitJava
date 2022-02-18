package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentAlice = new Student(1001, "Alice");
		studentAlice.addSubject("English", 100);
		studentAlice.addSubject("Math", 90);
		studentAlice.showStudentInfo();
		
		System.out.println("==========");
		
		Student studentBob = new Student(1002, "Bob");
		studentBob.addSubject("English", 100);
		studentBob.addSubject("Math", 90);
		studentBob.addSubject("Korean", 80);
		studentBob.showStudentInfo();
	}

}
