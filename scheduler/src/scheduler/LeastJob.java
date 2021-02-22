package scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("Receive requests in ordered.");
    }
    @Override
    public void sendCallToAgent() {
        System.out.println("Receive requests to least delayed agent.");
    }
}
