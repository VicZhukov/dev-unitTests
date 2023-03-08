package ua.vic.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThatSumWithOneWorksCorrect() {
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumWithThreeWorksCorrect() {
        //When
        int actual = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumThrowsExceptionWorksCorrect(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
