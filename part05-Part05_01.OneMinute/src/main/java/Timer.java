public class Timer {
    private ClockHand hundredSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundredSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    @Override
    public String toString() {
        return seconds + ":" + hundredSeconds;
    }

    public void advance() {
        this.hundredSeconds.advance();
        if (this.hundredSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

}
