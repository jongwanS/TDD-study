import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneryTest {

    @Test
    public void testMultiplication(){
        Dallor five = new Dallor(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
