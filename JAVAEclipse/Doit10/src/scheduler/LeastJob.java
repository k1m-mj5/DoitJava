package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Get the call from the queue.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assigned to the agent with fewest calls.");		
	}

}
