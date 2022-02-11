package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while( num <= 10 ) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum + " is the sum of numbers from 1 to 10.");
	}

}
