package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTest1 extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        long result = calculator.mult(3, 2);
        Assert.assertEquals(6, result);
    }
}
