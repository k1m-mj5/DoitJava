package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("Human is driving.");
		System.out.println("Human is operating the handle.");
	}

	@Override
	public void stop() {
		System.out.println("Human is stepping on the brake.");
	}
	
	public void wiper() {
		System.out.println("Human is turning on the windshield wipers.");
	}

}
