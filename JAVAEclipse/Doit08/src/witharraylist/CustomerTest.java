package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer001 = new Customer();
		Customer customer002 = new Customer();
		GoldCustomer customer003 = (GoldCustomer) new Customer();
		GoldCustomer customer004 = (GoldCustomer) new Customer();
		VIPCustomer customer005 = new VIPCustomer();
		
		customerList.add(customer001);
		customerList.add(customer002);
		customerList.add(customer003);
		customerList.add(customer004);
		customerList.add(customer005);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
}
