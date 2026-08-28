import java.util.ArrayList;

public class Package {
    private final ArrayList<Gift> listaRegali;
    private int totalWeight;

    public Package() {
        listaRegali = new ArrayList<>();
        totalWeight = 0;
    }

    public void addGift(Gift gift) {
        listaRegali.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift : listaRegali) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
