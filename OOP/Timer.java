package OOP;

public class Timer {
    private ClockHand hundredtHand;
    private ClockHand secondsHand;

    public Timer() {
        this.hundredtHand = new ClockHand(100);
        this.secondsHand = new ClockHand(60);
    }

    public void advance() {
        this.hundredtHand.advance();

        if (this.hundredtHand.value() == 0) {
            this.secondsHand.advance();
        }
    }

    public String toString() {
        return secondsHand + ":" + hundredtHand;
    }
}
