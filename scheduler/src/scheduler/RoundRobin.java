package scheduler;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("Receive requests in ordered.");
    }
    @Override
    public void sendCallToAgent() {
    System.out.println("Send request to next agent.");
    }
}
//    @Override
//    public void getNextCall() {
//
//    }
//    @Override
//    public void sendCallToAgent() {
//
//    }