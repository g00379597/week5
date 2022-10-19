package ie.atu.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myTotal;

    @BeforeEach
    void setUp() {
        myTotal = new Calculator();
    }

    @Test
    void testAdd()
    {
        assertEquals(5, myTotal.add(3,2));
    }
}
