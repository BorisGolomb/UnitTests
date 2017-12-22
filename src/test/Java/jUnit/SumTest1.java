package jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SumTest1 extends BaseTest {

    @Test
    public void testSumPositiveNumbers() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(3, result);
    }
}
