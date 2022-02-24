package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// R, L, P
		System.out.println("Please choose assign way. R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if( ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if ( ch == 'L' || ch == 'I') {
			scheduler = new LeastJob();
		} else if ( ch == 'P' || ch == 'P') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("Please check your chosen.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
