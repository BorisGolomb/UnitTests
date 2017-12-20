package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.tg(1);
        Assert.assertEquals(1, result, 0);
    }
}
