package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		while (sum < 100) {
			sum += num;
			num ++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
