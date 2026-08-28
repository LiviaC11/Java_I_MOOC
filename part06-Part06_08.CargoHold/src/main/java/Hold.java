import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private final ArrayList<Suitcase> suitC;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitC = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase sC : this.suitC) {
            totalWeight += sC.totalWeight();
        }
        if ((totalWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.suitC.add(suitcase);
        }
    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase sC : suitC) {
            totalWeight += sC.totalWeight();
        }
        return this.suitC.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitC) {
            suitcase.printItems();
        }
    }
}
