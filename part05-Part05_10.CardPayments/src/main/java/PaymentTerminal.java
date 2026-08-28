
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;
    }

    // 1. Pagamento in CONTANTI (Cassa aumenta)
    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        } else {
            this.money += 2.50; // <--- Aggiunge i contanti in cassa
            this.affordableMeals++;
            return payment - 2.50;
        }
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        } else {
            this.money += 4.30; // <--- Aggiunge i contanti in cassa
            this.heartyMeals++;
            return payment - 4.30;
        }
    }

    // 2. Pagamento con CARTA (Cassa NON aumenta)
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    // 3. Ricarica della CARTA in cassa
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum; // <--- I contanti usati per ricaricare entrano in cassa
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}