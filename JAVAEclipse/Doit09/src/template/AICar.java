package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("Driving Automatically.");
		System.out.println("Operating the handle Automatically.");
	}

	@Override
	public void stop() {
		System.out.println("Stepping on the brake Automatically.");
	}
	
	@Override
	public void wiper() {
		System.out.println("Turning on the windshield wipers Automatically.");
	}
}
