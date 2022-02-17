package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[3] = 30.0;
		
		double total = 0.0;
		for(int i=0; i<num.length; i++) {
			total += num[i];
		}
		
		System.out.println(total); // 60.0
	}

}
