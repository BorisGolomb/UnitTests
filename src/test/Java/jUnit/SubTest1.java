package jUnit;

import org.junit.Assert;
import org.junit.Test;

public class SubTest1 extends BaseTest {

    @Test
    public void testSubPositiveNumbers() {
        long result = calculator.sub(3, 2);
        Assert.assertEquals(1, result);
    }
}
