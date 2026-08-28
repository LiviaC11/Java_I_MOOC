public class Statistics {
    private int count;
    private int somma;

    public Statistics() {
        this.count = 0;
        this.somma = 0;

    }

    public void addNumber(int number) {
        this.somma += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.somma;
    }

    public double average() {

        if (this.count == 0) {
            return 0.0;
        } else {
            return (double) this.somma / this.count;
        }

    }
}