package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class MultTest1 extends BaseTest {

    @Test
    public void testMultPositiveNumbers() {
        long result = calculator.mult(3, 2);
        Assert.assertEquals(6, result);
    }
}
