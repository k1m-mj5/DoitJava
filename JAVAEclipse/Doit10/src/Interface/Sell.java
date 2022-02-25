package Interface;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("Sales order");
	}
}
