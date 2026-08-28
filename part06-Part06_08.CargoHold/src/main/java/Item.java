public class Item {
    private String name;
    private int weightKg;

    public Item(String name, int weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weightKg;
    }

    public String toString() {
        return this.name + " (" + this.weightKg + " kg)";
    }

}
