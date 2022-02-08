package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num); // 1000
		
		long lNum = 10;
		float fNum = lNum; // -24
		
		System.out.println(fNum); // 3
		
		double dNum = fNum + num; 
		System.out.println(dNum); // 4
	}

}
