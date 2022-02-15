package thisexam;

class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1); // thisexam.Birthday@2f92e0f4
		b1.printThis(); // thisexam.Birthday@2f92e0f4
		
		System.out.println(b2); // thisexam.Birthday@28a418fc
		b2.printThis(); // thisexam.Birthday@28a418fc
	}

}
