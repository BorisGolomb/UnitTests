package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class CosTest extends BaseTest {

    @Test
    public void testCosPositiveNumbers() {
        double result = calculator.cos(1);
        Assert.assertEquals(1, result, 0);
    }
}
