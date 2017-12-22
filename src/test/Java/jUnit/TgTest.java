package jUnit;

import org.junit.Assert;
import org.junit.Test;

public class TgTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.tg(1);
        Assert.assertEquals(1, result, 0);
    }
}
