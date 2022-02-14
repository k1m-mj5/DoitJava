package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAlice = new Student(100, "Alice");
		studentAlice.setKorean(100);
		studentAlice.setMath(100);
		
		Student studentBob = new Student(101, "Bob");
		studentBob.setKorean(95);
		studentBob.setMath(98);
		
		studentAlice.showStudentInfo();
		studentBob.showStudentInfo();
	}

}
