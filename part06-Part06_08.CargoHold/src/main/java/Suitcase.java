import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private final ArrayList<Item> contenuto;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contenuto = new ArrayList<>();
    }

    public void addItem(Item item) {
        int actualWeight = 0;
        for (Item obj : this.contenuto) {
            actualWeight += obj.getWeight();
        }
        if (actualWeight + item.getWeight() <= maxWeight) {
            this.contenuto.add(item);
        }

    }

    public String toString() {
        if (this.contenuto.isEmpty()) {
            return "no items (" + this.contenuto.size() + " kg)";
        }
        if (this.contenuto.size() == 1) {
            int kilos = this.contenuto.get(0).getWeight();
            return this.contenuto.size() + " item (" + kilos + " kg)";
        }
        int totWeight = 0;
        for (Item item : this.contenuto) {
            totWeight += item.getWeight();
        }
        return this.contenuto.size() + " items (" + totWeight + " kg)";
    }

    public void printItems() {
        for (Item item : contenuto) {
            System.out.println(item);
        }

    }

    public int totalWeight() {
        int totWeight = 0;
        for (Item item : this.contenuto) {
            totWeight += item.getWeight();
        }
        return totWeight;
    }

    public Item heaviestItem() {
        if (this.contenuto.isEmpty()) {
            return null;
        }
        Item heaviest = this.contenuto.get(0);
        for (Item item : this.contenuto) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

}
