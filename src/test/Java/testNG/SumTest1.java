package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SumTest1 extends BaseTest {

    @Test
    public void testSumPositiveNumbers() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(3, result);
    }
}