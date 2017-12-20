package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class SinTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.sin(30);
        Assert.assertEquals(1, result, 0);
    }
}
