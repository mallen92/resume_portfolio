import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarOfNumbersTest {

    @Test
    public void findTheDiffBetweenEvenIntsAndOddInts1() {
        // Sum of odds > sum of evens
        int[] myArr = {35, 24, 49, 25};

        assertEquals(85, WarOfNumbers.subtract(myArr));
    }

    @Test
    public void findTheDiffBetweenEvenIntsAndOddInts2() {
        // Sum of evens > sum of odds
        int[] myArr = {15, 32, 42, 45};

        assertEquals(14, WarOfNumbers.subtract(myArr));
    }

    @Test
    public void findTheDiffBetweenEvenIntsAndOddInts3() {
        // Sum of evens > sum of odds
        int[] myArr = {1, 1, 1, 1};

        assertEquals(4, WarOfNumbers.subtract(myArr));
    }
}
