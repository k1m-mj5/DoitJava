package ifexample;

public class IfExample2 {
	
	public static void main(String[] args) {
		
		int age = 9;
		int charge = 0;
		
		if(age < 8 ) {
			charge = 10;
			System.out.println("Infant");
		}
		else if(age < 14) {
			charge = 20;
			System.out.println("Child");
		}
		else if(age < 20) {
			charge = 25;
			System.out.println("Teenager");
		}
		else {
			charge = 30;
			System.out.println("Adult");
		}
		
		System.out.println("Entrance fee is " + charge + "USD.");
	}
}
