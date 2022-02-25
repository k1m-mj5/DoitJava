package Interface;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Selling");
	}

	@Override
	public void buy() {
		System.out.println("Buying");
	}

	@Override
	public void order() {
		System.out.println("Customer Sales Order");
	}

}
