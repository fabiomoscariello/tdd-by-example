package guru.springframework;

public class Money {
    protected int amount;    
    
    public boolean equals(Object object){
        Money franc = (Money) object;
        return amount == franc.amount;
    }
}
