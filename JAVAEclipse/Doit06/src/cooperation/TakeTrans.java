package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student alice = new Student("Alice", 50);
		Student bob = new Student("Bob", 100);
		
		Bus bus100 = new Bus(100);
		alice.takeBus(bus100);
		alice.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		bob.takeSubway(subwayGreen);
		bob.showInfo();
		subwayGreen.showInfo();
	}

}
