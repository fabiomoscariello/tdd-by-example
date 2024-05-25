package guru.springframework;
public class Bank {

    public Bank(){

    }

    Money reduce(Expression source, String toCurrency){
        if(source instanceof Money) return (Money) source;
        Sum sum = (Sum) source;
        return sum.reduce(toCurrency);
    }
    
}
