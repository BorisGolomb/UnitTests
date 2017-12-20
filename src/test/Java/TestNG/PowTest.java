package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.pow(3, 2);
        Assert.assertEquals(9, result, 0);
    }
}