package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();

	public void startCar() {
		System.out.println("Start a car.");
	}
	
	public void turnOff() {
		System.out.println("Turn off engine.");
	}
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
