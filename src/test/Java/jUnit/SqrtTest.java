package jUnit;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.sqrt(4);
        Assert.assertEquals(2, result, 0);
    }
}