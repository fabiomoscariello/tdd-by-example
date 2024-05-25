package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar myDollar = new Dollar(5);
        Dollar product = myDollar.times(2);
        assertEquals(new Dollar(10), product);
        product = myDollar.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(10));
    }

    @Test
    void testFranc(){
        Franc myFranc = new Franc(5);
        Franc product = myFranc.times(2);
        assertEquals(new Franc(10), product);
        product = myFranc.times(3);
        assertEquals(new Franc(15), product);
    }

}
