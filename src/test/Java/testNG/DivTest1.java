package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest1 extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.div(6, 4);
        Assert.assertEquals(1, result , 2);
    }

}
