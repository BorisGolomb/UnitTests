package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class PowTest extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.pow(3, 2);
        Assert.assertEquals(9, result, 0);
    }
}
