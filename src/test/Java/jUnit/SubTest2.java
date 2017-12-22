package jUnit;

import org.junit.Assert;
import org.junit.Test;

public class SubTest2 extends BaseTest {

    @Test

    public void testSubPositiveNumbers() {
        double result = calculator.sub(3, 2);
        Assert.assertEquals(1, result , 0);
    }
}
