package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		/*
		Customer customerAlice = new Customer();
		customerAlice.setCustomerID(10100);
		customerAlice.setCustomerName("Alice");
		*/
		VIPCustomer customerBob = new VIPCustomer();
		customerBob.setCustomerID(10101);
		customerBob.setCustomerName("Bob");
		
		customerBob.bonusPoint = 1000;
		
		// System.out.println(customerAlice.showCustomerInfo());
		System.out.println(customerBob.showCustomerInfo());
	}

}
