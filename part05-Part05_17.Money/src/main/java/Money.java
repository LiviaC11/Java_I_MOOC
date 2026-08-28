
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (compared.euros < this.euros) {
            return false;
        } else if (compared.euros == this.euros) {
            if (compared.cents < this.cents) {
                return false;
            }

        }
        return true;
    }

    public Money minus(Money decreaser) {
        int totBase = this.cents + (this.euros * 100);
        int totSottr = decreaser.cents + (decreaser.euros * 100);
        int differenza = totBase - totSottr;

        if (differenza < 0) {
            return new Money(0, 0);
        }
        Money newMoney = new Money(0, differenza);

        return newMoney;

    }

}
