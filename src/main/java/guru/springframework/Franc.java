package guru.springframework;

public class Franc {
    private int amount;

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
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    public boolean hashCode(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
