package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class SumTest2 extends  BaseTest {

    @Test
    public void testSumPositiveNumbers() {
        double result = calculator.sum(1, 2);
        Assert.assertEquals(3, result , 0);
    }

}
