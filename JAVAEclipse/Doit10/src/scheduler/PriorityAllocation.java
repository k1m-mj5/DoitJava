package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Get the call from the top priority grade guests first.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assigned to the multi-skilled agent first.");		
	}

}
