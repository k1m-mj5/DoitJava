package staticexam;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentA = new Student();
		System.out.println(studentA.studentID); // 10001
		
		Student studentB = new Student();
		System.out.println(studentB.studentID); // 10002
		
		System.out.println(studentA.serialNum); // 10002
		System.out.println(studentB.serialNum); // 10002
		
	}

}
