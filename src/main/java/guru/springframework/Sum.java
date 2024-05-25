package guru.springframework;

public class Sum implements Expression {
    public Money firstAddend;
    public Money secondAddend;

    public Sum(Money firstAddend, Money secondAddend){
        this.firstAddend = firstAddend;
        this.secondAddend = secondAddend;
    }

    public Money reduce(String toCurrency){
        int amount = this.firstAddend.amount + this.secondAddend.amount;
        return new Money(amount, toCurrency);
    }
}