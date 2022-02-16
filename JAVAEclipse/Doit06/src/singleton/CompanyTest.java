package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1); // singleton.Company@2f92e0f4
		System.out.println(c2); // singleton.Company@2f92e0f4
		
		Calendar cal = Calendar.getInstance();
		
	}

}
