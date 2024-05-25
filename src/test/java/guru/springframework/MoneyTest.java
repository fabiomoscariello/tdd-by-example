package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar myDollar = Money.dollar(5);
        assertEquals(Money.dollar(10), myDollar.times(2));
        assertEquals(Money.dollar(15), myDollar.times(3) );
    }

    @Test
    void testMultiplicationFranc(){
        Franc myFranc = Money.franc(5);
        assertEquals(Money.franc(10), myFranc.times(2));
        assertNotEquals(Money.franc(15), myFranc.times(5));
    }

    @Test
    void testPlusReturnsSum(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five,sum.firstAddend);
    }

    @Test
    void testReduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1),result);

    }

    @Test
    void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7),result);

    }

    @Test
    void testEquality(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }

}
