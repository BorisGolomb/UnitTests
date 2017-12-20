package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class DivTest1 extends BaseTest {

    @Test
    public void testDivPositiveNumbers() {
        long result = calculator.div(6, 0);
        Assert.assertEquals(6, result);
    }
}
