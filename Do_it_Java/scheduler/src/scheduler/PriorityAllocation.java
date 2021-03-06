package scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("Receive high priority requests first.");
    }
    @Override
    public void sendCallToAgent() {
        System.out.println("Send request to agent who work ability is higher first.");
    }
}
