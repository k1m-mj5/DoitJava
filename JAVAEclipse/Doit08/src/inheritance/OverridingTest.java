package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer customerAlice = new Customer();
		customerAlice.calcPrice(10000);
		System.out.println(customerAlice.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer();
		int price = customerWho.calcPrice(10000);
	}

}
