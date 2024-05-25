package guru.springframework;

public class Money implements Expression{
    protected int amount;    
    protected String currency;

    public Money(int amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }
    

    public static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    public Money times(int times){
        return new Money(this.amount * times, this.currency);
    }

    public boolean equals(Object object){
        Money franc = (Money) object;
        return amount == franc.amount && this.getClass().equals(object.getClass());
    }

    public Expression plus(Money added){
        return new Sum(this, added);
    }
}
