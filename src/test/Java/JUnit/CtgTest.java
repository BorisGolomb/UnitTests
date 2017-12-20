package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class CtgTest extends BaseTest {

    @Test
    public void testCtgPositiveNumbers() {
        double result = calculator.ctg(1);
        Assert.assertEquals(1, result, 0);
    }
}
