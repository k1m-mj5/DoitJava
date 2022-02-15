package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(10);
		money -= 10;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(15);
		money -= 15;
	}
	
	public void showInfo() {
		System.out.println(studentName + " has " + money);
	}
}
