package jUnit;

import org.junit.Assert;
import org.junit.Test;

public class DivTest2  extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.div(6, 4);
        Assert.assertEquals(1, result , 2);
    }

}
