package guru.springframework;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int times) {
        return new Franc(this.amount*times);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object){
        Money franc = (Franc) object;
        return amount == franc.amount;
    }
}
